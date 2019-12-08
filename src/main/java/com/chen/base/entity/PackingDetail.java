package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 装箱单明细

 *
 * @author Mr.D
 * @date 2019/12/07
 */
@Data
public class PackingDetail implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 装箱单id
     */
    private Integer packingInfoId;

    /**
     * 国家id
     */
    private String countryId;

    /**
     * 易仓SKU
     */
    private String eccangSku;

    /**
     * sku数量
     */
    private Integer skuNum;

    /**
     * 头程费单价
     */
    private Float firstCarrierFreightUp;

    /**
     * 申报价值单价
     */
    private Float opDeclaredValue;

    /**
     * 申报价值币种
     */
    private Float opDeclaredCurrency;

    /**
     * 清关VAT单价
     */
    private Float declarationCustomsVat;

    /**
     * 销项VAT单价
     */
    private Float outputTaxUp;

    /**
     * 批次创建时间
     */
    private Date createTime;

    /**
     * SKU税费
     */
    private Float skuTaxes;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}