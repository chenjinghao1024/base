package com.chen.base.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lombok.Data;

/**
 * 
 *
 * @author Mr.D
 * @date 2019/05/30
 */
@Data
public class SysUser implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 登陆账号
     */
    private String loginName;

    /**
     * 
     */
    private String password;

    /**
     * 加密盐值
     */
    private String salt;

    /**
     * 真实姓名
     */
    private String nickName;

    /**
     * 状态：0禁用，1启用
     */
    private Byte userStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户角色
     */
    private Set<String> roles = new HashSet<>();
    /**
     * 用户角色对应权限
     */
    private Set<String> permissions = new HashSet<>();
}