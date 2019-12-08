package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

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
    /**
     * 税费
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
            TariffRateExample.Criteria tariffRateExampleCriteria= tariffRateExample.createCriteria();
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

}
