package com.chen.base.service;

import com.chen.base.entity.PageParams;
import com.chen.base.entity.SysUser;
import com.chen.base.entity.SysUserExample;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.mapper.SysUserMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 *
 *
 * @author Administrator
 */
@Service
public class UserService {

    @Resource
    SysUserMapper sysUserMapper;


    public PageInfo<SysUser> getUsersByPage(PageParams params) {

        SysUserExample example = new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("create_time");

        Map<String, String> searchMap = params.getSearchMap();
        if (searchMap != null && !params.getSearchMap().isEmpty()) {

        }

        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> sysUserMapper.selectByExample(example));
    }


    public ResultVO changeStatus(Integer id, Byte userStatus) {

        SysUser sysUser = new SysUser();
        sysUser.setId(id);
        sysUser.setUserStatus(userStatus);
        int count = sysUserMapper.updateByPrimaryKeySelective(sysUser);
        if (count > 0) {
            return ResultVO.succ("/user/changeStatus","修改成功!",id);
        }else {
            return ResultVO.fail("/user/changeStatus","修改失败!",id);
        }
    }

    public ResultVO createOrEditUser(SysUser user) {
        int count;
        if (user.getId() != null) {
            count = sysUserMapper.updateByPrimaryKeySelective(user);
        } else {
            ByteSource credentialsSalt01 = ByteSource.Util.bytes(user.getLoginName());
            Object credential = user.getPassword();
            String hashAlgorithmName = "MD5";//加密方式
            //1024指的是加密的次数
            Object simpleHash = new SimpleHash(hashAlgorithmName, credential,
                    credentialsSalt01, 1024);
            user.setPassword(simpleHash.toString());
            user.setCreateTime(new Date());
            count = sysUserMapper.insertSelective(user);
        }
        if (count > 0) {
            return ResultVO.succ("/user/createOrEditUser","新增成功!");
        }else {
            return ResultVO.fail("/user/createOrEditUser","新增失败!");
        }
    }

    public SysUser getUserById(Integer id) {
        SysUser user = sysUserMapper.selectByPrimaryKey(id);
        return user;
    }
}
