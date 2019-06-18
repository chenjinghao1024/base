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
public class SysRole implements Serializable {
    /**
     * 自增主键
     */
    private Integer id;

    /**
     * 
     */
    private String roleName;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;
}