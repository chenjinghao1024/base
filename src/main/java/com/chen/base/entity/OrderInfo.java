package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 订单列表
 *
 * @author Mr.D
 * @date 2019/11/22
 */
@Data
public class OrderInfo implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 平台代码
     */
    private String platform;

    /**
     * 销售单号
     */
    private String saleOrderCode;

    /**
     * 仓库单号
     */
    private String warehouseOrderCode;

    /**
     * 公司代码
     */
    private String companyCode;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 仓库id
     */
    private Integer warehouseId;

    /**
     * 总金额
     */
    private Float amountpaid;

    /**
     * 销售额
     */
    private Float subtotal;

    /**
     * 币种
     */
    private String currency;

    /**
     * 仓库发货时间
     */
    private Date dateWarehouseShipping;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

}
