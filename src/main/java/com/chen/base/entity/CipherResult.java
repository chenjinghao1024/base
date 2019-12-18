package com.chen.base.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

// 产品毛利  销售额 - 采购价 - 头程
/**
 * 计算结果
 */
@Data
@RequiredArgsConstructor
public class CipherResult {

    @NonNull
    private String sku;
    /**
     * 站点
     */
    private String site;
    /**
     * 平台
     */
    private String platform;

    /**
     * 产品描述
     */
    private String productDesc;

    /**
     * 品类
     */
    private String category;
    /**
     * 销量
     */
    private int quantity;
    /**
     * 库存
     */
    private String stock;

    /**
     * 销售额 sku 单价总和
     */
    private float sales;

    /**
     * 采购价格
     */
    private float buyingPrice;
    /**
     * 头程
     */
    private float headway;

    /**
     * 关税
     */
    private float tariff;
    /**
     * 转运费  留空
     */
    private float transshipment;

    /**
     * 销项税
     */
    private float outputTax;
    /**
     * 清关VAT
     */
    private float clearVAT;

    /**
     * 仓租
     */
    private float warehouseRental;

    /**
     * 广告费用
     */
    private float advCost;

    /**
     * 退款
     */
    private float refund;
    /**
     * FBA派送费
     */
    private float shippingFeeFba;
    /**
     * 目的地派送费
     */
    private float shippingFee;
    /**
     * paypal手续费
     */
    private float paypalFee;
    /**
     * 平台手续费
     */
    private float platformCost;
    /**
     * 平台手续费
     */
    private float clickFarming;


    public void addToBuyingPrice(float buyingPrice) {
        this.buyingPrice += buyingPrice;
    }

    public void addToClearVAT(float clearVAT) {
        this.clearVAT += clearVAT;
    }

    public void addToHeadway(float headway){
        this.headway += headway;
    }

    public void addToTariff(float tariff){
        this.tariff += tariff;
    }
    public void addToOutputTax(double outputTax){
        this.outputTax += outputTax;
    }
    public void addToWarehouseRental(float warehouseRental){
        this.warehouseRental += warehouseRental;
    }

    public void addToAdvCost(double advCost) {
        this.advCost += advCost;
    }

    public void addToQuantity(Integer quantity){
        this.quantity += quantity;
    }

    public void addToRefund(double refund) {
        this.refund += refund;
    }
    public void addToShippingFee(double shippingFee) {
        this.shippingFee += shippingFee;
    }

    public void addToShippingFeeFba(double shippingFeeFba) {
        this.shippingFeeFba += shippingFeeFba;
    }

    public void addToPaypalFee(double paypalFee) {
        this.paypalFee += paypalFee;
    }
    public void addToPlatformCost(double platformCost) {
        this.platformCost += platformCost;
    }
    public void addToSales(double sales) {
        this.sales += sales;
    }


    public float grossProfit(){
        return sales - headway - buyingPrice;
    }

    public float operatingMargin(){
        return grossProfit() - refund - clickFarming - advCost - paypalFee - platformCost - warehouseRental - shippingFee
                - shippingFeeFba - clearVAT - outputTax - tariff;
    }

}
