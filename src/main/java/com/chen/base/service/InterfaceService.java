package com.chen.base.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.chen.base.entity.*;
import com.chen.base.mapper.OrderDetailMapper;
import com.chen.base.mapper.OrderInfoMapper;
import com.chen.base.mapper.ProductBySkuMapper;
import com.chen.base.mapper.WarehouseListMapper;
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
    WarehouseListMapper warehouseListMapper;
    @Resource
    OrderInfoMapper orderInfoMapper;

    @Resource
    OrderDetailMapper orderDetailMapper;

    public int orderSync() {

        Map<String, Object> requestParameter = new HashMap(5);
        Map condition = new HashMap(0);

        int count = 0;
        int page = 412;
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
                orderInfo.setSaleOrderCode(orderJSON.getString("saleOrderCode"));
                orderInfo.setPlatform(orderJSON.getString("platform"));
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

    public int warehouseSync() {
        Map<String, Object> requestParameter = new HashMap(5);
        JSONObject result = soapRequest("getWarehouse", "WMS", requestParameter);
        int count = 0;

        JSONObject datas = result.getJSONObject("data");

        Set<String> keySet = datas.keySet();

        for (String s : keySet) {
            JSONObject warehouseJSON = datas.getJSONObject(s);

            WarehouseList warehouse = new WarehouseList();

            warehouse.setId(warehouseJSON.getInteger("warehouseId"));
            warehouse.setCountryId(warehouseJSON.getInteger("countryId"));

            count += warehouseListMapper.insertSelective(warehouse);
        }


        return count;
    }


    public void getOrders(Integer id) {
        int doID = 0;
        try {
            OrderInfoExample orderInfoExample = new OrderInfoExample();
            OrderInfoExample.Criteria orderInfoCriteria = orderInfoExample.createCriteria();
            orderInfoCriteria.andIdGreaterThanOrEqualTo(id);
            List<OrderInfo> orderinfos = orderInfoMapper.selectByExample(orderInfoExample);
            for (OrderInfo orderInfo : orderinfos) {
                doID = orderInfo.getId();
                Map<String, Object> getOrdersParameter = new HashMap(5);
                List list = new ArrayList<>();
                list.add(orderInfo.getWarehouseOrderCode());
                getOrdersParameter.put("code", list);
                JSONArray getOrdersResults = soapRequest("getOrders", "WMS", getOrdersParameter).getJSONArray("data");

                if (getOrdersResults.size() == 0) {
                    System.out.println(orderInfo.getWarehouseOrderCode());
                }
//            SO19100190066
                JSONArray orderProductList = getOrdersResults.getJSONObject(0).getJSONArray("productList");

                for (Object product : orderProductList) {

                    JSONObject productJSON= (JSONObject) product;
                    String sku = productJSON.getString("platformSalesSku");
                    OrderDetailExample orderDetailExample = new OrderDetailExample();
                    OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
                    criteria.andOrderlistIdEqualTo(orderInfo.getId());
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
                    criteria.andOrderlistIdEqualTo(orderInfo.getId());
                    criteria.andProductSkuEqualTo(sku);
                    List<OrderDetail> details = orderDetailMapper.selectByExample(orderDetailExample);
                    if (details.size() == 0) {
                        continue;
                    }
                    OrderDetail orderDetail= details.get(0);

                    JSONObject product = (JSONObject) getOrderInfoProduct;
                    op_paypal_fee += product.getFloatValue("op_paypal_fee");

                    orderDetail.setOpPaypalFee(op_paypal_fee);
                    // shippingFee
                    if ("1".equals(getOrderInfoOrder.get("is_fba"))) {
                        orderDetail.setShippingFeeFba(productJSON.getFloatValue("shippingFee"));
                    }else {
                        orderDetail.setShippingFee(productJSON.getFloatValue("shippingFee"));
                    }
                    orderDetailMapper.updateByPrimaryKeySelective(orderDetail);

                }
            }
        }catch (Exception e){
            getOrders(doID);
        }
    }

    public void sync(){
        int pageSize = 100;
        Map<String, Object> requestParameter = new HashMap(5);
        Map condition = new HashMap(0);

        int count = 0;
        int page = 412;
        int totalCount = 0;

        requestParameter.put("pageSize", pageSize);
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
                OrderInfoExample orderInfoExample = new OrderInfoExample();
                OrderInfoExample.Criteria criteria = orderInfoExample.createCriteria();
                criteria.andSaleOrderCodeEqualTo(orderJSON.getString("saleOrderCode"));
                List<OrderInfo> order = orderInfoMapper.selectByExample(orderInfoExample);
                OrderInfo orderInfo = order.get(0);
                JSONArray orderDetails = orderJSON.getJSONArray("orderDetails");

                orderDetails.forEach(JSON -> {
                    JSONObject orderDetailJSON= (JSONObject) JSON;
                    OrderDetail orderDetail = new OrderDetail(orderInfo.getId());

                    orderDetail.setProductSku(orderDetailJSON.getString("productSku"));
                    orderDetail.setSku(orderDetailJSON.getString("sku"));
                    orderDetail.setQuantity(orderDetailJSON.getIntValue("qty"));
                    orderDetailMapper.insertSelective(orderDetail);
                });
            }
        } while (page * pageSize < totalCount);

    }
}
