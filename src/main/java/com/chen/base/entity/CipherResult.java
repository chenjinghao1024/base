package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 *
 *
 * @author Mr.D
 * @date 2019/12/25
 */
@Data
public class CipherResult implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     *
     */
    private String yearMonth;

    /**
     * 平台
     */
    private String platform;

    /**
     * 品类名称
     */
    private String categoryName;

    /**
     * 易仓SKU
     */
    private String sku;

    /**
     * 站点
     */
    private String site;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 数量
     */
    private Integer quantity;

    /**
     * 销售额
     */
    private Float sales;

    /**
     *  采购运费+采购成本
     */
    private Float paymentPlatformFree;

    /**
     * fba费用
     */
    private Float fbaFee;

    /**
     * 退款金额
     */
    private Float refund;

    /**
     * 头程运费
     */
    private Float firstCarrierFreight;

    /**
     * 清关VAT单价
     */
    private Float declarationCustomsVat;

    /**
     * 关税费
     */
    private Float tariffFee;

    /**
     * 销项VAT单价
     */
    private Float outputTaxUp;

    /**
     * FBA配送费
     */
    private Float shippingFeeFba;

    /**
     * 配送费
     */
    private Float shippingFee;

    /**
     * palpay手续费
     */
    private Float paypalFee;

    /**
     * 平台手续费
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
     * 采购成本
     */
    private Float purchaseCost;

    /**
     * 广告费
     */
    private Float advertisementCost;

    /**
     * 刷单费
     */
    private Float clickFarmingFee;

    /**
     *
     */
    private Integer isFba;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    public void addToShippingFeeFba(float shippingFeeFba) {
        this.shippingFeeFba += shippingFeeFba;
    }

    public void addToPaypalFee(float paypalFee) {
        this.paypalFee += paypalFee;
    }
    public void addToPlatformCost(float platformCost) {
        this.platformCost += platformCost;
    }
    public void addToSales(float sales) {
        this.sales += sales;
    }

    public void addToPurchaseCost(float platformCost) {
        this.platformCost += platformCost;
    }

    public void addToRefund(float refund) {
        this.refund += refund;
    }

    public void addToShippingFee(float shippingFee) {
        this.shippingFee += shippingFee;
    }

    public void addToPurchaseShippingFee(float purchaseShippingFee) {
        this.purchaseShippingFee += purchaseShippingFee;
    }

    public void addToPurchaseTaxationFee(float purchaseTaxationFee) {
        this.purchaseTaxationFee += purchaseTaxationFee;
    }

    public void addToQuantity(Integer quantity) {
        this.quantity += quantity;
    }
}
