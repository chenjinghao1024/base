package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 产品明细表
 *
 * @author Mr.D
 * @date 2019/11/21
 */
@Data
public class ProductSkuInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 易仓SKUid
     */
    private Integer productBySkuId;

    /**
     * 组合子产品SKU
     */
    private String pcrProductSku;

    /**
     * 数量
     */
    private String pcrQty;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}