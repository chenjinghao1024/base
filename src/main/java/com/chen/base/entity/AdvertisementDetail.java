package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 广告费明细
 *
 * @author Mr.D
 * @date 2019/12/16
 */
@Data
public class AdvertisementDetail implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 广告费文件id
     */
    private Integer advertisementFileId;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 站点
     */
    private String site;

    /**
     * 导入的广告的SKU就是易仓的SKU
     */
    private String eccangSku;

    /**
     * 广告费
     */
    private Float cost;

    /**
     * 币种
     */
    private String currency;

    /**
     * 国家id
     */
    private String countryId;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}