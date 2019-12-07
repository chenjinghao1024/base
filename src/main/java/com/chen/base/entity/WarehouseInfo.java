package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 仓库明细对应表
 *
 * @author Mr.D
 * @date 2019/11/21
 */
@Data
public class WarehouseInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 仓库id
     */
    private Integer warehouseId;

    /**
     * 
     */
    private Integer eccangWarehouseId;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}