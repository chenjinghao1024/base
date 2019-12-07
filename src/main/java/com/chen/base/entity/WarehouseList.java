package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 仓库list表
 *
 * @author Mr.D
 * @date 2019/11/21
 */
@Data
public class WarehouseList implements Serializable {
    /**
     * 仓库id
     */
    private Integer id;

    /**
     * 仓库名称
     */
    private String warehouseName;

    /**
     * 国家id
     */
    private Integer countryId;

    /**
     * 仓库仓储费
     */
    private Float warehouseStorageCharges;

    /**
     * 币种
     */
    private Float currency;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}