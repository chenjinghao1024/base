package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.entity.vo.RequestVO;
import com.chen.base.mapper.*;
import com.chen.base.util.CommonUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MeasureService {

    @Resource
    OrderInfoMapper orderInfoMapper;

    @Resource
    OrderDetailMapper orderDetailMapper;

    @Resource
    ClickFarmingDetailMapper clickFarmingDetailMapper;

    @Resource
    ProductBySkuMapper productBySkuMapper;

    @Resource
    MeasureResultMapper measureResultMapper;

    @Resource
    CipherService cipherService;

    @Resource
    OutputTaxAllMapper outputTaxAllMapper;
    @Resource
    WarehouseRentMapper warehouseRentMapper;
    @Resource
    AdvertisementDetailMapper advertisementDetailMapper;

    public void orderMeasure(RequestVO requestVO) {
        // 根据所选时间获取时间段内所有订单
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria orderInfoCriteria = orderInfoExample.createCriteria();
        orderInfoCriteria.andDateWarehouseShippingGreaterThanOrEqualTo(requestVO.getStartDate());
        orderInfoCriteria.andDateWarehouseShippingLessThanOrEqualTo(requestVO.getEndDate());
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(orderInfoExample);

        OrderDetailExample detailExample = new OrderDetailExample();
        ClickFarmingDetailExample clickFarmingDetailExample = new ClickFarmingDetailExample();
        ProductBySkuExample productBySkuExample = new ProductBySkuExample();

        for (OrderInfo orderInfo : orderInfos) {
            // 获取订单详情
            detailExample.clear();
            OrderDetailExample.Criteria criteria = detailExample.createCriteria();
            criteria.andOrderInfoIdEqualTo(orderInfo.getId());
            List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(detailExample);
            for (OrderDetail orderDetail : orderDetails) {
                // 订单详情内SKU存在部分问题,此处需做处理
                String productSku = orderDetail.getProductSku();
                String sku = orderDetail.getSku();
                sku=sku.substring(0, sku.indexOf('*'));

                String site = orderInfo.getSite();

                // 查询该订单是否为刷单订单
                clickFarmingDetailExample.clear();
                ClickFarmingDetailExample.Criteria clickFarmingCriteria = clickFarmingDetailExample.createCriteria();
                clickFarmingCriteria.andSaleOrderCodesEqualTo(orderInfo.getSaleOrderCode());
                clickFarmingCriteria.andInfoIdIn(requestVO.getCfIds());
                List<ClickFarmingDetail> clickFarmingDetails = clickFarmingDetailMapper.selectByExample(clickFarmingDetailExample);

                Float clickFarmingFee = 0.0f;
                // 如果检测到该订单为刷单订单 将订单SKU替换为 刷单文件中SKU(成本计算)
                // 并且获取刷单费
                if (clickFarmingDetails.size() > 0) {
                    ClickFarmingDetail clickFarmingDetail = clickFarmingDetails.get(0);
                    if (clickFarmingDetail.getSendFlag() == 1) {
                        sku = clickFarmingDetail.getEccangSku();
                        clickFarmingFee = clickFarmingDetail.getClickFarmingFee();
                    }
                }


                // 部分数据同步出现异常, 碰到异常数据跳过
                Float cost = orderDetail.getPurchaseCost();
                if (cost == null) {
                    continue;
                }
                // 获取发货时间 格式化为 年月 格式
                String yearMouth = CommonUtil.formatter(orderInfo.getDateWarehouseShipping());

                MeasureResult cipherResult = getResult(yearMouth,orderInfo.getPlatform(), sku, orderInfo.getSite(),orderDetail.getIsFba());
                // 计入刷单费
                cipherResult.addToClickFarmingFee(clickFarmingFee);

                // 查询产品信息 记录产品名称及品类名称
                productBySkuExample.clear();
                ProductBySkuExample.Criteria productCriteria = productBySkuExample.createCriteria();
                productCriteria.andProductSkuEqualTo(sku);
                List<ProductBySku> products = productBySkuMapper.selectByExample(productBySkuExample);
                if (products.size() > 0) {
                    ProductBySku product = products.get(0);
                    cipherResult.setProductName(product.getProductTitleCn());
                    cipherResult.setCategoryName(product.getProcutCategoryName1());
                }

                //本订单汇率
                Float rate = cipherService.getRate(orderDetail.getCurrency());
                Integer quantity = orderDetail.getQuantity();

                orderStatistics(orderDetail, cipherResult, rate, quantity);

                buyingPrice(cipherResult, orderDetail, quantity);

                // 清关 头程 税费
                clearVAT(cipherResult,orderDetail,quantity);

                // 销项
                outputTax(orderInfo, cipherResult, site, orderDetail, quantity);

                // 仓租
                warehouseRent(cipherResult, orderDetail);
                // 广告
                adv(orderInfo, cipherResult, site, orderDetail, quantity,requestVO.getAdvIds());

            }

        }

    }

    private void outputTax(OrderInfo orderInfo, MeasureResult cipherResult, String site, OrderDetail orderDetail, Integer quantity) {
        if (orderInfo.getPlatform().equals("amazon")) {
            OutputTaxAllExample outputTaxAllExample = new OutputTaxAllExample();
            OutputTaxAllExample.Criteria criteria = outputTaxAllExample.createCriteria();
            criteria.andSiteEqualTo(site);
            criteria.andMonthNumEqualTo(-1);
            List<OutputTaxAll> outputTaxAlls = outputTaxAllMapper.selectByExample(outputTaxAllExample);
            if (outputTaxAlls.size() > 0) {
                Float outputTaxVatAll = outputTaxAlls.get(0).getOutputTaxAll();
                if (outputTaxVatAll != null) {
                    float outputTax = orderDetail.getPrice() * outputTaxVatAll;
                    cipherResult.addToOutputTax(outputTax * quantity);
                }
            }
        }
    }

    /**
     * 根据条件获取对应结果记录 如果没有对应记录 则创建
     * @param yearMouth 年月标记
     * @param platform 订单平台
     * @param sku 订单商品sku
     * @param site 订单站点
     * @param isFba 订单是否FBA
     * @return
     */
    private MeasureResult getResult(String yearMouth, String platform, String sku, String site, Integer isFba){
        if (isFba == null) {
            isFba = 0;
        }
        MeasureResultExample cipherResultExample = new MeasureResultExample();
        MeasureResultExample.Criteria criteria = cipherResultExample.createCriteria();
        criteria.andYearAndMonthEqualTo(yearMouth);
        criteria.andPlatformEqualTo(platform);
        criteria.andSkuEqualTo(sku);
        criteria.andSiteEqualTo(site);
        criteria.andIsFbaEqualTo(isFba);
        List<MeasureResult> cipherResults = measureResultMapper.selectByExample(cipherResultExample);
        if (cipherResults.size() > 0) {
            return cipherResults.get(0);
        }
        MeasureResult measureResult = new MeasureResult();
        measureResult.setYearAndMonth(yearMouth);
        measureResult.setPlatform(platform);
        measureResult.setSku(sku);
        measureResult.setSite(site);
        measureResult.setIsFba(isFba);
        measureResultMapper.insertSelectiveReturnId(measureResult);

        return measureResult;
    }

    private void orderStatistics(OrderDetail orderDetail, MeasureResult measureResult, Float rate, Integer quantity) {
        // 销量
        measureResult.addToQuantity(quantity);
        float refund;
        if (orderDetail.getRefund() == null) {
            refund = 0;
        }else {
            refund = orderDetail.getRefund();
        }
        measureResult.addToRefund(refund * rate);
        measureResult.addToPaypalFee(orderDetail.getOpPaypalFee() == null ? 0.0f :orderDetail.getOpPaypalFee());
        measureResult.addToPlatformCost(orderDetail.getPlatformCost() == null ? 0.0f : orderDetail.getPlatformCost());
        Float shippingFeeFba = orderDetail.getShippingFeeFba();
        shippingFeeFba = shippingFeeFba == null ? 0 : shippingFeeFba;
        measureResult.addToShippingFeeFba(shippingFeeFba * rate);
        Float shippingFee = orderDetail.getShippingFee();
        shippingFee = shippingFee == null ? 0 : shippingFee;
        measureResult.addToShippingFee(shippingFee * rate);

        Float price = orderDetail.getPrice();
        price = price == null ? 0 : price;
        measureResult.addToSales(price * quantity * rate);

    }


    private void buyingPrice(MeasureResult cipherResult, OrderDetail orderDetail, Integer quantity) {
        // 计算采购价格
        float purchaseCost = orderDetail.getPurchaseCost();
        Float purchaseShippingFee = orderDetail.getPurchaseShippingFee();
        Float purchaseTaxationFee = orderDetail.getPurchaseTaxationFee();

        if (purchaseTaxationFee == null) {
            purchaseTaxationFee = 0.0f;
        }if (purchaseShippingFee == null) {
            purchaseShippingFee = 0.0f;
        }
        cipherResult.addToPurchaseCost(quantity * purchaseCost);
        cipherResult.addToPurchaseShippingFee(quantity * purchaseShippingFee);
        cipherResult.addToPurchaseTaxationFee(quantity * purchaseTaxationFee);
    }

    // TODO
    private void clearVAT(MeasureResult cipherResult, OrderDetail orderDetail, Integer quantity) {
        // 清关VAT



    }
    // TODO
    private void warehouseRent(MeasureResult cipherResult, OrderDetail orderDetail) {

    }

    private void adv(OrderInfo orderInfo, MeasureResult cipherResult, String site, OrderDetail orderDetail, Integer quantity, List<Integer> advIds) {

        String platform = orderInfo.getPlatform();
        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria info = orderInfoExample.createCriteria();
        info.andSiteEqualTo(site);
        info.andPlatformEqualTo(platform);
        List<OrderInfo> siteOrders = orderInfoMapper.selectByExample(orderInfoExample);

        AdvertisementDetailExample advertisementDetailExample = new AdvertisementDetailExample();
        AdvertisementDetailExample.Criteria criteria1 = advertisementDetailExample.createCriteria();
        criteria1.andSiteEqualTo(site);
        criteria1.andEccangSkuEqualTo(orderDetail.getProductSku());
        criteria1.andAdvertisementFileIdIn(advIds);
        List<AdvertisementDetail> advs = advertisementDetailMapper.selectByExample(advertisementDetailExample);


        switch (platform) {
            case "amazon":
            case "ebay":
                if (advs.size() > 0) {
                    ArrayList<Integer> siteOrderIds = new ArrayList<>();
                    siteOrders.forEach(orderInfo1 -> siteOrderIds.add(orderInfo1.getId()));
                    OrderDetailExample orderDetailExample = new OrderDetailExample();
                    OrderDetailExample.Criteria detailExampleCriteria = orderDetailExample.createCriteria();
                    detailExampleCriteria.andOrderInfoIdIn(siteOrderIds);
                    List<OrderDetail> orderDetails1 = orderDetailMapper.selectByExample(orderDetailExample);
                    int skuCount = orderDetails1.stream().mapToInt(orderDetail1 -> orderDetail.getQuantity()).sum();
                    AdvertisementDetail adv = advs.get(0);
                    Float rate = cipherService.getRate(adv.getCurrency());
                    cipherResult.addToAdvCost((adv.getCost() * rate / skuCount) * quantity);
                }

                break;
            case "cdiscount":
                if (advs.size() > 0) {
                    double siteSubTotal = siteOrders.stream().mapToDouble(orderDetail2 -> orderDetail2.getSubtotal()).sum();

                    AdvertisementDetail adv = advs.get(0);
                    Float rate = cipherService.getRate(adv.getCurrency());
                    Double advCost = orderInfo.getSubtotal() / siteSubTotal * adv.getCost() * rate;

                    cipherResult.addToAdvCost(advCost.floatValue());
                }
                break;
            default:
        }
    }
}
