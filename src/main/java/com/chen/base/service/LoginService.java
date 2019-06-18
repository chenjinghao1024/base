package com.chen.base.service;

import com.chen.base.entity.SysPermission;
import com.chen.base.entity.SysUser;
import com.chen.base.mapper.SysPermissionMapper;
import com.chen.base.mapper.SysRoleMapper;
import com.chen.base.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Set;

/**
 * 登陆/角色权限Service
 * @author Mr.d
 */
@Service
public class LoginService {

    @Resource
    SysUserMapper userMapper;
    @Resource
    SysRoleMapper roleMapper;
    @Resource
    SysPermissionMapper permissionMapper;
    public SysUser getByUserName(String userName) {
        return userMapper.findByUserName(userName);
    }

    public Set<String> getRolesByUserId(int userId) {
        return roleMapper.findByUserId(userId);
    }

    public Set<String> getPermissionByUserId(int userId) {
        return permissionMapper.findByUserId(userId);
    }

}
