package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 汇率表
 *
 * @author Mr.D
 * @date 2019/12/11
 */
@Data
public class CurrencyRate implements Serializable {
    /**
     * 国家币种代码
     */
    private String currencyCode;

    /**
     * 币种名称
     */
    private String currencyName;

    /**
     * 
     */
    private Float currencyRate;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}