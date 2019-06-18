package com.chen.base.mapper;

import com.chen.base.entity.SysUser;
import com.chen.base.entity.SysUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper {
    /**
     * countByExample
     */
    long countByExample(SysUserExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(SysUserExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(SysUser record);

    /**
     * insertSelective
     */
    int insertSelective(SysUser record);

    /**
     * selectByExample
     */
    List<SysUser> selectByExample(SysUserExample example);

    /**
     * selectByPrimaryKey
     */
    SysUser selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(SysUser record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(SysUser record);

    /**
     * 根据用户名获取用户信息
     * @param userName 用户名
     * @return 用户信息
     */
    SysUser findByUserName(String userName);
}