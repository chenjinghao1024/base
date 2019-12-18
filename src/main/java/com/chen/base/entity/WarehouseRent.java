package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 临时仓租表
 *
 * @author Mr.D
 * @date 2019/12/18
 */
@Data
public class WarehouseRent implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 
     */
    private String warehouseCode;

    /**
     * 国家ID
     */
    private Integer warehouseId;

    /**
     * 
     */
    private String sku;

    /**
     * 仓租
     */
    private Float rent;

    /**
     * 币种
     */
    private String currency;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}