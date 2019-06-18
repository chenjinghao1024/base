package com.chen.base.mapper;

import com.chen.base.entity.SysRole;
import com.chen.base.entity.SysRoleExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMapper {
    /**
     * countByExample
     */
    long countByExample(SysRoleExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(SysRoleExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(SysRole record);

    /**
     * insertSelective
     */
    int insertSelective(SysRole record);

    /**
     * selectByExample
     */
    List<SysRole> selectByExample(SysRoleExample example);

    /**
     * selectByPrimaryKey
     */
    SysRole selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(SysRole record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(SysRole record);

    Set<String> findByUserId(int userId);
}