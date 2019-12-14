package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 临时仓租表
 *
 * @author Mr.D
 * @date 2019/12/13
 */
@Data
public class WarehouseRent implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 国家ID
     */
    private Integer countryId;

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