package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 刷单明细

 *
 * @author Mr.D
 * @date 2019/12/16
 */
@Data
public class ClickFarmingDetail implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 父表ID
     */
    private Integer infoId;

    /**
     * 平台账号，对应Excel中的店铺
     */
    private String userAccounts;

    /**
     * 销售单号
     */
    private String saleOrderCodes;

    /**
     * 
     */
    private String eccangSku;

    /**
     * 发货状态 0:未发货 1已发货

     */
    private Integer sendFlag;

    /**
     * 刷单费
     */
    private Float clickFarmingFee;

    /**
     * 刷单时间
     */
    private Date clickFarmingTime;

    /**
     * 站点
     */
    private String site;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}