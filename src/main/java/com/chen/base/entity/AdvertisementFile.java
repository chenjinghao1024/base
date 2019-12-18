package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 广告费上传list
 *
 * @author Mr.D
 * @date 2019/12/16
 */
@Data
public class AdvertisementFile implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 广告导入文件系统名称
     */
    private String advertisementFileSysname;

    /**
     * 文件原始名称
     */
    private String advertisementFileName;

    /**
     * 上传文件路径
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