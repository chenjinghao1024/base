package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 仓库明细对应表
 *
 * @author Mr.D
 * @date 2019/12/11
 */
@Data
public class WarehouseRelation implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 虚拟仓库id
     */
    private Integer virtualWarehouseId;

    /**
     * 易仓仓库ID
     */
    private Integer warehouseId;

    /**
     * 仓库代码
     */
    private String warehouseCode;

    /**
     * 仓库描述
     */
    private String warehouseDesc;

    /**
     * 城市
     */
    private Integer countryId;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}
