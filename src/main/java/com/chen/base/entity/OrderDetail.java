package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 *
 *
 * @author Mr.D
 * @date 2019/12/09
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class OrderDetail implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    @NonNull
    private Integer orderInfoId;

    /**
     * 销售sku
     */
    private String productSku;

    /**
     * 仓库sku
     */
    private String sku;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 单价
     */
    private Float price;

    /**
     * 申报价值，取自装箱单
     */
    private Float declaredValue;

    /**
     * 重量
     */
    private Float weight;

    /**
     * 币种
     */
    private String currency;

    /**
     * 汇率
     */
    private Float currencyRate;

    /**
     * 支付手续费
     */
    private Float paymentPlatformFree;

    /**
     * fba手续
     */
    private Float fbaFee;

    /**
     * 退款金额
     */
    private Float refund;

    /**
     * 采购成本
     */
    private Float purchaseCost;

    /**
     * 头程运费
     */
    private Float firstCarrierFreight;

    /**
     * 清关VAT单价，取自packinglistinfo
     */
    private Float declarationCustomsVat;

    /**
     * 销项VAT单价
     */
    private Float outputTaxUp;

    /**
     * FBA配送费
     */
    private Float shippingFeeFba;

    /**
     * 目的地派送费
     */
    private Float shippingFee;

    /**
     * palpay手续费
     */
    private Float opPaypalFee;

    /**
     * 平台手续费，接口查询订单信息
     */
    private Float platformCost;

    /**
     * 仓租，自己算的
     */
    private Float warehouseStorageCharges;

    /**
     * 采购税费
     */
    private Float purchaseTaxationFee;

    /**
     * 采购运费
     */
    private Float purchaseShippingFee;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}
