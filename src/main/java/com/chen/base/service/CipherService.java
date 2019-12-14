package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.*;

@Service
public class CipherService {

    @Resource
    PackingInfoMapper packingInfoMapper;

    @Resource
    PackingDetailMapper packingDetailMapper;

    @Resource
    TariffRateMapper tariffRateMapper;

    @Resource
    DeclarationCustomsVatRateMapper declarationCustomsVatRateMapper;

    @Resource
    ProductBySkuMapper productBySkuMapper;

    @Resource
    OrderInfoMapper orderInfoMapper;
    @Resource
    OrderDetailMapper orderDetailMapper;
    @Resource
    CountryMapper countryMapper;
    @Resource
    CurrencyRateMapper currencyRateMapper;

    @Resource
    WarehouseRentMapper warehouseRentMapper;
    /**
     * 税费
     *
     * @param packingInfoId
     */
    public void tariffCipher(Integer packingInfoId) {
        PackingDetailExample packingDetailExample = new PackingDetailExample();
        PackingDetailExample.Criteria packingDetailExampleCriteria = packingDetailExample.createCriteria();
        packingDetailExampleCriteria.andPackingInfoIdEqualTo(packingInfoId);
        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);
        for (PackingDetail packingDetail : packingDetails) {
            Float declaredValue = packingDetail.getOpDeclaredValue();
            String sku = packingDetail.getEccangSku();
            String countryId = packingDetail.getCountryId();

            TariffRateExample tariffRateExample = new TariffRateExample();
            TariffRateExample.Criteria tariffRateExampleCriteria = tariffRateExample.createCriteria();
            tariffRateExampleCriteria.andCountryIdEqualTo(Integer.valueOf(countryId));
            tariffRateExampleCriteria.andEccangSkuEqualTo(sku);
            List<TariffRate> tariffRates = tariffRateMapper.selectByExample(tariffRateExample);
            TariffRate tariffRate = tariffRates.get(0);
            Float rate = tariffRate.getTariffRate();
            packingDetail.setSkuTaxes(rate * declaredValue);

            packingDetailMapper.updateByPrimaryKeySelective(packingDetail);

        }
    }

    /**
     * 清关VAT单价
     *
     * @param packingInfoId
     */
    public void CCVATCipher(Integer packingInfoId) {
        PackingDetailExample packingDetailExample = new PackingDetailExample();
        PackingDetailExample.Criteria packingDetailExampleCriteria = packingDetailExample.createCriteria();
        packingDetailExampleCriteria.andPackingInfoIdEqualTo(packingInfoId);
        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);
        for (PackingDetail packingDetail : packingDetails) {
            Float declaredValue = packingDetail.getOpDeclaredValue();
            String countryId = packingDetail.getCountryId();

            DeclarationCustomsVatRate declarationCustomsVatRate = declarationCustomsVatRateMapper.selectByPrimaryKey(Integer.valueOf(countryId));
            Float rate = declarationCustomsVatRate.getDeclarationCustomsVatRate();
            float CCVAT = declaredValue * rate;

            float vat = CCVAT / packingDetail.getSkuNum();
            packingDetail.setDeclarationCustomsVat(vat);

            packingDetailMapper.updateByPrimaryKeySelective(packingDetail);

        }
    }

    /**
     * 头程运费
     *
     * @param packingInfoId
     */
    public void firstWayCipher(Integer packingInfoId) {

        // 装箱单下所有物品体积之和
        int 总体积 = 100;
        PackingInfo packingInfo = packingInfoMapper.selectByPrimaryKey(packingInfoId);
        Float firstCarrierFreightAll = packingInfo.getFirstCarrierFreightAll();

        PackingDetailExample packingDetailExample = new PackingDetailExample();
        PackingDetailExample.Criteria packingDetailExampleCriteria = packingDetailExample.createCriteria();
        packingDetailExampleCriteria.andPackingInfoIdEqualTo(packingInfoId);
        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);
        for (PackingDetail packingDetail : packingDetails) {
            String sku = packingDetail.getEccangSku();

            ProductBySku product = productBySkuMapper.selectByPrimaryKey(sku);
            Float length = Float.valueOf(product.getProductLength());
            Float height = Float.valueOf(product.getProductHeight());
            Float width = Float.valueOf(product.getProductWidth());

            float volume = length * height * width;

            float firstCarrierFreight = firstCarrierFreightAll * (volume / 总体积);
            packingDetail.setFirstCarrierFreightUp(firstCarrierFreight);

            packingDetailMapper.updateByPrimaryKeySelective(packingDetail);

        }
    }

    /**
     * 采购价格
     *
     * @return
     */
    public float priceCipher(Integer orderDetailId) {
        OrderDetail orderDetail = orderDetailMapper.selectByPrimaryKey(orderDetailId);
        float price = orderDetail.getPurchaseCost() + orderDetail.getPurchaseShippingFee() +
                orderDetail.getPurchaseTaxationFee();
        return price;

    }




    public List<CipherResult> orderCipher() {

        Map siteTotal = getTotalBySite();

        OrderInfoExample orderInfoExample = new OrderInfoExample();
        OrderInfoExample.Criteria orderInfoCriteria = orderInfoExample.createCriteria();
        orderInfoCriteria.andIdLessThanOrEqualTo(10);
//        orderInfoCriteria.andIdEqualTo(163);
        List<OrderInfo> orderInfos = orderInfoMapper.selectByExample(orderInfoExample);

        OrderDetailExample orderDetailExample = new OrderDetailExample();
        PackingInfoExample packingInfoExample = new PackingInfoExample();
        PackingDetailExample packingDetailExample = new PackingDetailExample();
        CountryExample countryExample = new CountryExample();
        WarehouseRentExample warehouseRentExample = new WarehouseRentExample();


        List<CipherResult> cipherResults = new ArrayList<>();
        Integer countryId;
        for (OrderInfo orderInfo : orderInfos) {

            CipherResult cipherResult = new CipherResult(orderInfo.getId(), orderInfo.getSaleOrderCode());
            cipherResults.add(cipherResult);

            orderDetailExample.clear();
            OrderDetailExample.Criteria criteria = orderDetailExample.createCriteria();
            criteria.andOrderInfoIdEqualTo(orderInfo.getId());
            String site = orderInfo.getSite();
            String countryCode;
            if (site.lastIndexOf('.') != -1) {
                countryCode=site.substring(site.lastIndexOf('.') + 1, site.length());
            } else {
                countryCode = site;
            }


            countryExample.clear();
            CountryExample.Criteria countryExampleCriteria = countryExample.createCriteria();
            countryExampleCriteria.andCodeEqualTo(countryCode.toUpperCase());
            List<Country> countries = countryMapper.selectByExample(countryExample);
            if (countries.size() == 0) {
                continue;
            }else {
                countryId = countries.get(0).getId();
            }


            List<OrderDetail> orderDetails = orderDetailMapper.selectByExample(orderDetailExample);
            for (OrderDetail orderDetail : orderDetails) {
                Integer quantity = orderDetail.getQuantity();

                buyingPrice(cipherResult, orderDetail, quantity);

                clearVAT(packingDetailExample, countryId, cipherResult,orderDetail,quantity);

                outputTax(siteTotal, packingInfoExample, countryId, orderInfo, cipherResult, site, orderDetail, quantity);

                String sku = orderDetail.getSku();
                sku=sku.substring(0, sku.indexOf("*"));
                warehouseRentExample.clear();
                WarehouseRentExample.Criteria warehouseRentExampleCriteria = warehouseRentExample.createCriteria();
                warehouseRentExampleCriteria.andSkuEqualTo(sku);
                warehouseRentExampleCriteria.andCountryIdEqualTo(countryId);

                List<WarehouseRent> warehouseRents = warehouseRentMapper.selectByExample(warehouseRentExample);
                if (warehouseRents.size() > 0) {
                    float rent = 0;
                    for (WarehouseRent warehouseRent : warehouseRents) {
                        CurrencyRate currencyRate = currencyRateMapper.selectByPrimaryKey(warehouseRent.getCurrency());
                        Float rate = currencyRate.getCurrencyRate();
                        rent += warehouseRent.getRent() * rate;
                    }
                    cipherResult.addToWarehouseRental(rent / warehouseRents.size());
                }
            }
            System.out.println(cipherResult.toString());
        }

        return cipherResults;
    }

    private void outputTax(Map siteTotal, PackingInfoExample packingInfoExample, Integer countryId, OrderInfo orderInfo,
                           CipherResult cipherResult, String site, OrderDetail orderDetail, Integer quantity) {
        if (orderInfo.getPlatform().equals("amazon")){
            Double total = (Double) siteTotal.get(site);
            if (total > 0) {
                double unitPriceRatio = orderDetail.getPrice() / total;
                packingInfoExample.clear();
                PackingInfoExample.Criteria packingInfoExampleCriteria = packingInfoExample.createCriteria();
                packingInfoExampleCriteria.andCountryIdEqualTo(String.valueOf(countryId));
                List<PackingInfo> packingInfos = packingInfoMapper.selectByExample(packingInfoExample);
                if (packingInfos.size() > 0) {
                    Float outputTaxVatAll = packingInfos.get(0).getOutputTaxVatAll();
                    if (outputTaxVatAll != null) {
                        double outputTax = outputTaxVatAll * unitPriceRatio;
                        cipherResult.addToOutputTax(outputTax * quantity);
                    }
                }
            }
        }
    }

    private void clearVAT(PackingDetailExample packingDetailExample, Integer countryId, CipherResult cipherResult,OrderDetail orderDetail, Integer quantity) {
        // 清关VAT

        packingDetailExample.clear();
        PackingDetailExample.Criteria packingDetailExampleCriteria1 = packingDetailExample.createCriteria();
        packingDetailExampleCriteria1.andCountryIdEqualTo(String.valueOf(countryId));
        packingDetailExampleCriteria1.andEccangSkuEqualTo(orderDetail.getProductSku());

        PackingDetailExample.Criteria packingDetailExampleCriteria2 = packingDetailExample.or();
        packingDetailExampleCriteria2.andCountryIdEqualTo(String.valueOf(countryId));
        String sku = orderDetail.getSku();
        sku=sku.substring(0, sku.indexOf("*"));
        packingDetailExampleCriteria2.andEccangSkuEqualTo(sku);
        List<PackingDetail> packingDetails = packingDetailMapper.selectByExample(packingDetailExample);

        if (packingDetails.size() > 0) {
            cipherResult.addToClearVAT(packingDetails.get(0).getDeclarationCustomsVat()*quantity);
            cipherResult.addToHeadway(packingDetails.get(0).getFirstCarrierFreightUp()*quantity);
            cipherResult.addToTariff(packingDetails.get(0).getSkuTaxes()*quantity);
        }


    }

    /**
     * 计算采购价格
     * @param cipherResult
     * @param orderDetail
     * @param quantity
     */
    private void buyingPrice(CipherResult cipherResult, OrderDetail orderDetail, Integer quantity) {
        // 计算采购价格
        float purchaseCost = orderDetail.getPurchaseCost();
        Float purchaseShippingFee = orderDetail.getPurchaseShippingFee();
        Float purchaseTaxationFee = orderDetail.getPurchaseTaxationFee();

        if (purchaseTaxationFee == null) {
            purchaseTaxationFee = 0.0f;
        }if (purchaseShippingFee == null) {
            purchaseShippingFee = 0.0f;
        }
        float buyingPrice = purchaseCost + purchaseShippingFee + purchaseTaxationFee;
        cipherResult.addToBuyingPrice(quantity*buyingPrice);
    }

    private Map getTotalBySite(){
        Map siteTotal = new HashMap();
        List<Map> maps = orderInfoMapper.selectAMZTotalSalesGroupBySite();
        for (Map map : maps) {
            String site = (String) map.get("site");
            Double subtotal= (Double) map.get("subtotal");
            String currency= (String) map.get("currency");

            CurrencyRate currencyRate = currencyRateMapper.selectByPrimaryKey(currency);
            Float rate = currencyRate.getCurrencyRate();
            if (site.startsWith("Amazon")) {
                siteTotal.put(site, subtotal * rate);
            }
        }
        return siteTotal;
    }
}
