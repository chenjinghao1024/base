package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 关税率
 *
 * @author Mr.D
 * @date 2019/12/07
 */
@Data
public class TariffRate implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 国家
     */
    private Integer countryId;

    /**
     * 易仓SKU
     */
    private String eccangSku;

    /**
     * 关税率
     */
    private Float tariffRate;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}