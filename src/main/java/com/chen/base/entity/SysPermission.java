package com.chen.base.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/05/30
 */
@Data
public class SysPermission implements Serializable {
    /**
     * 自增长主键
     */
    private Integer id;

    /**
     * 权限名称
     */
    private String name;

    /**
     * 
     */
    private String url;

    /**
     * 
     */
    private String method;

    /**
     * 备注
     */
    private String desc;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}