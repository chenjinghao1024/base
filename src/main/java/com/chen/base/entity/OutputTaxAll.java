package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 销项VAT每月合计
 *
 * @author Mr.D
 * @date 2019/12/17
 */
@Data
public class OutputTaxAll implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 站点

     */
    private String site;

    /**
     * 月数
     */
    private Integer monthNum;

    /**
     * 销项VAT总计，导入。只有亚马逊的订单有销项
     */
    private Float outputTaxAll;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}