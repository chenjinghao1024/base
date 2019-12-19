package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 装箱单列表
 *
 * @author Mr.D
 * @date 2019/12/17
 */
@Data
public class PackingInfo implements Serializable {
    /**
     *
     */
    private Integer id;

    /**
     * 装箱单id
     */
    private String packingId;

    /**
     * 目的仓库
     */
    private Integer targetWarehouseId;

    /**
     * 头程费
     */
    private Float firstCarrierFreightAll;

    /**
     * 总销项VAT
     */
    private Float outputTaxVatAll;

    /**
     * 上传时间
     */
    private Date pcraddTime;

    /**
     * 头程文件名称
     */
    private String flieName;

    /**
     * 上传文件系统名称
     */
    private String fileNameSysname;

    /**
     * 文件保存地址
     */
    private String fileUrl;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 仓库
     */
    private WarehouseRelation warehouse;
}
