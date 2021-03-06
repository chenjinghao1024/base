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
    private int quantity;

    /**
     * 销售额
     */
    private float sales;

    /**
     *  采购运费+采购成本
     */
    private float paymentPlatformFree;

    /**
     * fba费用
     */
    private float fbaFee;

    /**
     * 退款金额
     */
    private float refund;

    /**
     * 头程运费
     */
    private float firstCarrierFreight;

    /**
     * 清关VAT单价
     */
    private float declarationCustomsVat;

    /**
     * 关税费
     */
    private float tariffFee;

    /**
     * 销项VAT单价
     */
    private float outputTaxUp;

    /**
     * FBA配送费
     */
    private float shippingFeeFba;

    /**
     * 配送费
     */
    private float shippingFee;

    /**
     * palpay手续费
     */
    private float paypalFee;

    /**
     * 平台手续费
     */
    private float platformCost;

    /**
     * 仓租，自己算的
     */
    private float warehouseStorageCharges;

    /**
     * 采购税费
     */
    private float purchaseTaxationFee;

    /**
     * 采购运费
     */
    private float purchaseShippingFee;

    /**
     * 采购成本
     */
    private float purchaseCost;

    /**
     * 广告费
     */
    private float advertisementCost;

    /**
     * 刷单费
     */
    private float clickFarmingFee;

    /**
     *
     */
    private int isFba;

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

    public void addToPurchaseCost(float paymentPlatformFree) {
        this.purchaseCost += paymentPlatformFree;
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

    public void addToTariff(float tariffFee) {
        this.tariffFee += tariffFee;
    }

    public void addToFirstCarrierFreight(float firstCarrierFreight) {
        this.firstCarrierFreight += firstCarrierFreight;
    }

    public void addToDeclarationCustomsVat(float declarationCustomsVat) {
        this.declarationCustomsVat += declarationCustomsVat;
    }

    public void addToOutputTax(float outputTaxUp) {
        this.outputTaxUp += outputTaxUp;

    }

    public void addToWarehouseRental(float warehouseStorageCharges) {
        this.warehouseStorageCharges += warehouseStorageCharges;
    }

    public void addToAdvCost(float advertisementCost) {
        this.advertisementCost += advertisementCost;
    }

    public void addToClickFarmingFee(float clickFarmingFee) {
        this.clickFarmingFee += clickFarmingFee;
    }

    public float getPurchasePriceExport(){
        return this.purchaseCost + this.purchaseShippingFee + this.purchaseTaxationFee;
    }

    public float grossProfit(){
        return sales - firstCarrierFreight - getPurchasePriceExport();
    }

    public float operatingMargin(){
        return grossProfit() - refund - clickFarmingFee - advertisementCost - paypalFee - platformCost -
                warehouseStorageCharges - shippingFee - shippingFeeFba - declarationCustomsVat - outputTaxUp - tariffFee;
    }

}
