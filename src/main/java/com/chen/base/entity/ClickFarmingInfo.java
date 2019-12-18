package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/12/16
 */
@Data
public class ClickFarmingInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 系统文件名称
     */
    private String clickFarmingFileSysname;

    /**
     * 上传文件名称
     */
    private String clickFarmingFileName;

    /**
     * 存储路径
     */
    private String urlFile;

    /**
     * 添加日期
     */
    private Date pcraddTime;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}