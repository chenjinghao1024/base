package com.chen.base.entity;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

/**
 * 计算结果
 */
@Data
@RequiredArgsConstructor
public class CipherResult {

    @NonNull
    public Integer orderId;

    @NonNull
    public String sale_order_code;

    /**
     * 销项税
     */
    public float outputTax;
    /**
     * 清关VAT
     */
    public float clearVAT;
    /**
     * 头程
     */
    public float headway;
    /**
     * 关税
     */
    public float tariff;

    /**
     * 采购价格
     */
    public float buyingPrice;
    /**
     * 仓租
     */
    public float warehouseRental;
    /**
     * 广告费用
     */
    public float advCost;


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
}
