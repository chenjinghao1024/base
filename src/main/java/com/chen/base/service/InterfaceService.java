package com.chen.base.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chen.base.entity.*;
import com.chen.base.mapper.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

import static com.chen.base.util.ECOpenApiService.soapRequest;


/**
 * 对接易仓接口服务类
 *
 * @author Chen_Sharp
 */
@Service
public class InterfaceService {

    private static List<String> sync_platforms = Arrays.asList("ebay","amazon","cdiscount");


    @Resource
    ProductBySkuMapper productBySkuMapper;
    @Resource
    OrderInfoMapper orderInfoMapper;
    @Resource
    WarehouseRelationMapper warehouseRelationMapper;
    @Resource
    OrderDetailMapper orderDetailMapper;
    @Resource
    CurrencyRateMapper currencyRateMapper;
    @Resource
    CountryMapper countryMapper;
    @Resource
    WarehouseRentMapper warehouseRentMapper;
    @Resource
    PackingDetailMapper packingDetailMapper;

    public int orderSync() {

        Map<String, Object> requestParameter = new HashMap(5);
        Map condition = new HashMap(0);

        int count = 0;
        int page = 0;
        int totalCount = 0;

        requestParameter.put("pageSize", 100);
        requestParameter.put("getDetail", 1);
        requestParameter.put("getAddress", 0);
        requestParameter.put("condition", condition);
        // 5332 5356 5381

        condition.put("warehouseShipDateFrom", "2019-10-01 00:00:00");
        condition.put("warehouseShipDateEnd", "2019-11-01 00:00:00");

        do {
            ++page;
            System.out.println("sync page > " + page);
            requestParameter.put("page", page);
            JSONObject result = null;
            try {
                System.out.println("soap start ");
                result = soapRequest("getOrderList", "EB", requestParameter);
                totalCount = result.getInteger("totalCount");
            } catch (Exception e) {
                page--;
                continue;
            }

            System.out.println("deal data");

            JSONArray orders = result.getJSONArray("data");

            for (Object data : orders) {

                JSONObject orderJSON = (JSONObject) data;
//
                String platform = orderJSON.getString("platform");
                if (!sync_platforms.contains(platform)){
                    continue;
                }
                OrderInfo orderInfo = new OrderInfo();
                orderInfo.setSite(orderJSON.getString("site"));
                orderInfo.setSaleOrderCode(orderJSON.getString("saleOrderCode"));
                orderInfo.setPlatform(platform);
                orderInfo.setWarehouseOrderCode(orderJSON.getString("warehouseOrderCode"));
                orderInfo.setCompanyCode(orderJSON.getString("companyCode"));
                orderInfo.setUserAccount(orderJSON.getString("userAccount"));
                orderInfo.setWarehouseId(orderJSON.getInteger("warehouseId"));
                orderInfo.setAmountpaid(orderJSON.getFloatValue("amountpaid"));
                orderInfo.setSubtotal(orderJSON.getFloatValue("subtotal"));
                orderInfo.setCurrency(orderJSON.getString("currency"));

                String datePaid = orderJSON.getString("datePaidPlatform");
                if (!datePaid.contains(" ")) {
                    datePaid = new StringBuffer(datePaid).insert(10, " ").toString();
                    orderJSON.put("datePaidPlatform", datePaid);
                }

                orderInfo.setDateWarehouseShipping(orderJSON.getDate("datePaidPlatform"));

                String dateStr = orderJSON.getString("createdDate");
                if (!dateStr.contains(" ")) {
                    dateStr = new StringBuffer(dateStr).insert(10, " ").toString();
                    orderJSON.put("createdDate", dateStr);
                }

                orderInfo.setCreateTime(orderJSON.getDate("createdDate"));
                count += orderInfoMapper.insertSelectiveReturnId(orderInfo);

                JSONArray orderDetails = orderJSON.getJSONArray("orderDetails");
                try {
                    orderDetails.forEach(orderDetailO -> {
                        JSONObject orderDetailJSON= (JSONObject) orderDetailO;
                        OrderDetail orderDetail = new OrderDetail(orderInfo.getId());

                        orderDetail.setProductSku(orderDetailJSON.getString("productSku"));
                        orderDetail.setSku(orderDetailJSON.getString("sku"));
                        orderDetail.setQuantity(orderDetailJSON.getIntValue("qty"));
                        orderDetailMapper.insertSelective(orderDetail);
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("ERROR ORDER ID:"+orderInfo.getId());
                }

            }
            System.out.println(count);
        } while (page * 100 < totalCount);
//559
        getOrders(0);
        return count;

    }

    public int productSync() {

        Map<String, Object> requestParameter = new HashMap(5);
        int page = 0;
        int totalCount;
        int syncCount = 0;

        requestParameter.put("pageSize", 1000);

        do {
            page++;
            requestParameter.put("page", page);
            System.out.println("soapRequest");
            JSONObject result = soapRequest("getProductList", "WMS", requestParameter);
            totalCount = result.getInteger("totalCount");

            JSONArray datas = result.getJSONArray("data");
            System.out.println("insert data");
            for (Object data : datas) {
                JSONObject product = (JSONObject) data;
                ProductBySku productBySku = new ProductBySku();
                productBySku.setProductSku(product.getString("productSku"));
                productBySku.setProductTitleCn(product.getString("productTitle"));
                productBySku.setProductTitleEn(product.getString("productTitleEn"));
                // 重量  非净重
                productBySku.setProductWeight(product.getString("productWeight"));
                productBySku.setProductLength(product.getString("productLength"));
                productBySku.setProductWidth(product.getString("productWidth"));
                productBySku.setProductHeight(product.getString("productHeight"));
                productBySku.setIsCombination(product.getString("isCombination"));
                // 供应商产品单价  作为产品单价使用  (供应商产品币种是否需要考虑)
                productBySku.setProductPrice(product.getFloatValue("sp_unit_price"));

                productBySku.setProcutCategoryCode1(product.getString("procutCategoryCode1"));
                productBySku.setProcutCategoryCode2(product.getString("procutCategoryCode2"));
                productBySku.setProcutCategoryCode3(product.getString("procutCategoryCode3"));

                productBySku.setProcutCategoryName1(product.getString("procutCategoryName1"));
                productBySku.setProcutCategoryName2(product.getString("procutCategoryName2"));
                productBySku.setProcutCategoryName3(product.getString("procutCategoryName3"));

                productBySku.setPuName(product.getString("puName"));
                productBySku.setUserOrganizationId(product.getInteger("userOrganizationId"));

                try {
                    syncCount += productBySkuMapper.insertSelective(productBySku);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("ERROR SKU : " + productBySku.getProductSku());
                }

            }
            System.out.println("page > " + page);
            System.out.println("syncCount > " + syncCount);
            System.out.println("totalCount >" + totalCount);
        } while (page * 1000 < totalCount);
        return syncCount;
    }

    /**
     * 仓库同步
     * @return
     */
    public int warehouseSync() {
        JSONObject result = soapRequest("getWarehouse", "WMS");
        int count = 0;

        JSONObject datas = result.getJSONObject("data");

        Set<String> keySet = datas.keySet();

        for (String s : keySet) {
            JSONObject warehouseJSON = datas.getJSONObject(s);

            WarehouseRelation warehouse = new WarehouseRelation();
            warehouse.setWarehouseId(warehouseJSON.getInteger("warehouseId"));
            warehouse.setWarehouseCode(warehouseJSON.getString("warehouseCode"));
            warehouse.setWarehouseDesc(warehouseJSON.getString("warehouseDesc"));
            warehouse.setCountryId(warehouseJSON.getInteger("countryId"));

            count+=warehouseRelationMapper.insertSelective(warehouse);
        }


        return count;
    }


    public void getOrders(Integer id) {
        int doID = id;
        try {
            OrderInfoExample orderInfoExample = new OrderInfoExample();
            OrderInfoExample.Criteria orderInfoCriteria = orderInfoExample.createCriteria();
            orderInfoCriteria.andIdGreaterThanOrEqualTo(id);
            List<OrderInfo> orderinfos = orderInfoMapper.selectByExample(orderInfoExample);
            for (OrderInfo orderInfo : orderinfos) {
                doID = orderInfo.getId();
                System.out.println("orderInfo id is "+doID);
                Map<String, Object> getOrdersParameter = new HashMap(5);
                List list = new ArrayList<>();
                list.add(orderInfo.getWarehouseOrderCode());
                getOrdersParameter.put("code", list);
                JSONArray getOrdersResults = soapRequest("getOrders", "WMS", getOrdersParameter).getJSONArray("data");

                if (getOrdersResults.size() == 0) {
                    System.out.println(orderInfo.getWarehouseOrderCode());
                }
                JSONArray orderProductList = getOrdersResults.getJSONObject(0).getJSONArray("productList");

                for (Object product : orderProductList) {

                    JSONObject productJSON= (JSONObject) product;
                    String sku = productJSON.getString("platformSalesSku");
                    OrderDetailExample orderDetailExample = new OrderDetailExample();
                    OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
                    criteria.andOrderInfoIdEqualTo(orderInfo.getId());
                    criteria.andProductSkuEqualTo(sku);
                    List<OrderDetail> details = orderDetailMapper.selectByExample(orderDetailExample);
                    if (details.size() == 0) {
                        continue;
                    }
                    OrderDetail orderDetail= details.get(0);
                    orderDetail.setWeight(productJSON.getFloatValue("weight"));
                    // getOrders    查询订单信息
                    orderDetail.setCurrency(productJSON.getString("currency"));
                    orderDetail.setCurrencyRate(productJSON.getFloatValue("currencyRate"));
                    orderDetail.setPaymentPlatformFree(productJSON.getFloatValue("paymentPlatformFee"));
                    orderDetail.setFbaFee(productJSON.getFloatValue("fbaFee"));
                    orderDetail.setPurchaseCost(productJSON.getFloatValue("purchaseCost"));

                    orderDetail.setPrice(productJSON.getFloatValue("price"));

                    orderDetail.setPlatformCost(productJSON.getFloatValue("platformCost"));

                    // 头程来源计算
                    orderDetail.setDeclaredValue(productJSON.getFloatValue("declaredValue"));

                    // 退款订单列表
                    orderDetail.setRefund(0.0f);
                    // 头程运费
                    orderDetail.setFirstCarrierFreight(0.0f);

                    //getOrderInfo 获取订单详情

                    orderDetailMapper.updateByPrimaryKeySelective(orderDetail);

                }

                Map<String, Object> getOrderInfoParameter = new HashMap(5);
                getOrderInfoParameter.put("orderCode", orderInfo.getWarehouseOrderCode());
                JSONObject result = soapRequest("getOrderInfo", "WMS", getOrderInfoParameter);
                JSONArray getOrderInfoProducts = result.getJSONObject("data").getJSONArray("product");
                JSONObject getOrderInfoOrder = result.getJSONObject("data").getJSONObject("order");
                float op_paypal_fee = 0L;
                for (Object getOrderInfoProduct : getOrderInfoProducts) {
                    JSONObject productJSON = (JSONObject) getOrderInfoProduct;

                    String sku = productJSON.getString("op_platform_sales_sku");
                    OrderDetailExample orderDetailExample = new OrderDetailExample();
                    OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
                    criteria.andOrderInfoIdEqualTo(orderInfo.getId());
                    criteria.andProductSkuEqualTo(sku);
                    List<OrderDetail> details = orderDetailMapper.selectByExample(orderDetailExample);
                    if (details.size() == 0) {
                        continue;
                    }
                    OrderDetail orderDetail= details.get(0);

                    JSONObject product = (JSONObject) getOrderInfoProduct;
                    op_paypal_fee += product.getFloatValue("op_paypal_fee");

                    orderDetail.setWarehouseId(getOrderInfoOrder.getInteger("warehouse_id"));

                    orderDetail.setOpPaypalFee(op_paypal_fee);
                    // shippingFee
                    if ("1".equals(getOrderInfoOrder.get("is_fba"))) {
                        orderDetail.setShippingFeeFba(productJSON.getFloatValue("op_shipping_fee"));
                    }else {
                        orderDetail.setShippingFee(productJSON.getFloatValue("op_shipping_fee"));
                    }
                    orderDetailMapper.updateByPrimaryKeySelective(orderDetail);

                }


                OrderDetailExample orderDetailExample = new OrderDetailExample();
                OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
                criteria.andOrderInfoIdEqualTo(orderInfo.getId());
                List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(orderDetailExample);
                for (OrderDetail orderDetail : orderDetails) {
                    String sku = orderDetail.getProductSku();
                    String warehouseOrderCode = orderInfo.getWarehouseOrderCode();
                    Map<String, Object> requestParameter = new HashMap(5);
                    ArrayList<Object> skus = new ArrayList<>();
                    skus.add(sku);
                    ArrayList<Object> warehouseOrderCodes = new ArrayList<>();
                    warehouseOrderCodes.add(warehouseOrderCode);
                    requestParameter.put("productSku", skus);
                    requestParameter.put("orderCode", warehouseOrderCodes);

                    JSONObject costDetailResult = soapRequest("getOrderCostDetailSku", "WMS", requestParameter);
                    JSONArray datas = costDetailResult.getJSONArray("data");
                    if (datas.size() > 0) {
                        JSONObject data = datas.getJSONObject(0);
                        float purchaseTaxationFee = data.getFloatValue("purchaseTaxationFee");
                        float purchaseShippingFee = data.getFloatValue("purchaseShippingFee");
                        orderDetail.setPurchaseTaxationFee(purchaseTaxationFee);
                        orderDetail.setPurchaseShippingFee(purchaseShippingFee);
                        orderDetailMapper.updateByPrimaryKeySelective(orderDetail);
                    }

                }

            }
        }catch (Exception e){
            getOrders(doID);
        }
    }

    /**
     * 币种
     */
    public int currencySync(){
        int count = 0;
        JSONObject result = soapRequest("getCurrency", "WMS");
        JSONArray currencies = result.getJSONArray("data");
        for (int i = 0; i < currencies.size(); i++) {
            JSONObject currency = currencies.getJSONObject(i);
            CurrencyRate currencyRate = new CurrencyRate();
            currencyRate.setCurrencyCode(currency.getString("currency_code"));
            currencyRate.setCurrencyName(currency.getString("currency_name"));
//            currencyRate.setCurrencyRate(currency.getFloatValue("currency_rate"));
            count += currencyRateMapper.insert(currencyRate);

        }
        return count;
    }


    public int countrySync(){
        int count = 0;
        JSONObject result = soapRequest("getCountry", "WMS");
        JSONObject countries = result.getJSONObject("data");
        Set<String> keySet = countries.keySet();
        for (String s : keySet) {
            JSONObject countryJSONObject = countries.getJSONObject(s);
            Country country = new Country();
            country.setId(countryJSONObject.getInteger("country_id"));
            country.setCode(countryJSONObject.getString("country_code"));
            countryMapper.insert(country);
        }
        return count;
    }

    public void refundSync() {
        int page = 0;
        int pageSize = 50;
        int totalCount = 0;
        Map<String, Object> refundParameter = new HashMap();

        refundParameter.put("pageSize", pageSize);
        refundParameter.put("create_date_form", "2019-10-01 00:00:00");
        refundParameter.put("create_date_to", "2019-11-01 00:00:00");
        do {
            page++;
            refundParameter.put("page", page);
            JSONObject result = soapRequest("rmaRefundList", "EB", refundParameter);
            totalCount = result.getInteger("total");
            JSONArray refundResults = result.getJSONArray("data");
            for (int i = 0; i < refundResults.size(); i++) {
                JSONObject refundResult = refundResults.getJSONObject(i);
                OrderInfoExample example= new OrderInfoExample();
                OrderInfoExample.Criteria criteria = example.createCriteria();
                criteria.andWarehouseOrderCodeEqualTo(refundResult.getString("warehouse_ref_no"));
                List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(example);
                if (orderInfos.size() > 0) {
                    OrderInfo orderInfo = orderInfos.get(0);
                    Integer orderInfoId = orderInfo.getId();

                    String sku = refundResult.getString("product_sku");
                    OrderDetailExample detailExample = new OrderDetailExample();
                    OrderDetailExample.Criteria detailExampleCriteria = detailExample.createCriteria();
                    detailExampleCriteria.andOrderInfoIdEqualTo(orderInfoId);
                    detailExampleCriteria.andSkuLike(sku + "%");
                    List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(detailExample);
                    if (orderDetails.size() > 0) {
                        OrderDetail orderDetail = orderDetails.get(0);
                        orderDetail.setRefund(refundResult.getFloatValue("amount_refund"));
                        orderDetailMapper.updateByPrimaryKeySelective(orderDetail);
                    }

                }
            }

        } while (page * pageSize < totalCount);

    }

}
