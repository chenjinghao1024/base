package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 虚拟仓库表
 *
 * @author Mr.D
 * @date 2019/12/20
 */
@Data
public class WarehouseVirtual implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 虚拟仓库名称

     */
    private String warehouseName;

    /**
     * 国家ID
     */
    private Integer countryId;

    /**
     * 仓库仓储费
     */
    private Float warehouseStorageCharges;

    /**
     * 币种
     */
    private String currency;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}