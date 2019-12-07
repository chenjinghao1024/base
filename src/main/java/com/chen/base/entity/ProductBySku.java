package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 产品列表
 *
 * @author Mr.D
 * @date 2019/11/21
 */
@Data
public class ProductBySku implements Serializable {
    /**
     * SKU代码
     */
    private String productSku;

    /**
     * 名称CN
     */
    private String productTitleCn;

    /**
     * 名称EN
     */
    private String productTitleEn;

    /**
     * 重量
     */
    private String productWeight;

    /**
     * 
     */
    private String productLength;

    /**
     * 
     */
    private String productWidth;

    /**
     * 
     */
    private String productHeight;

    /**
     * 是否是组合产品 ， 0否 1是
     */
    private String isCombination;

    /**
     * 商品单价
     */
    private Float productPrice;

    /**
     * 一级品类代码
     */
    private String procutCategoryCode1;

    /**
     * 二级品类代码
     */
    private String procutCategoryCode2;

    /**
     * 三级品类代码
     */
    private String procutCategoryCode3;

    /**
     * 
     */
    private String procutCategoryName1;

    /**
     * 
     */
    private String procutCategoryName2;

    /**
     * 
     */
    private String procutCategoryName3;

    /**
     * 单位名称
     */
    private String puName;

    /**
     * 组织机构ID
     */
    private Integer userOrganizationId;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}