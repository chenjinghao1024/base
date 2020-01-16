package com.chen.base.entity.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Data
public class RequestVO {
    /**
     * 开始时间
     */
    public Date startDate;

    /**
     * 结束时间
     */
    public Date endDate;

    /**
     * 广告文件ID
     */
    public List<Integer> advIds;

    /**
     * 刷单文件ID
     */
    public List<Integer> cfIds;

}
