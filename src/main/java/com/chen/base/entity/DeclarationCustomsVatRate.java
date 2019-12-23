package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 清关VAT税率表
 *
 * @author Mr.D
 * @date 2019/12/20
 */
@Data
public class DeclarationCustomsVatRate implements Serializable {
    /**
     * 国家id
     */
    private Integer countryId;

    /**
     * 清关VAT税率
     */
    private Float declarationCustomsVatRate;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    private Country country;
}
