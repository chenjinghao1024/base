package com.chen.base.mapper;

import com.chen.base.entity.SysPermission;
import com.chen.base.entity.SysPermissionExample;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysPermissionMapper {
    /**
     * countByExample
     */
    long countByExample(SysPermissionExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(SysPermissionExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(SysPermission record);

    /**
     * insertSelective
     */
    int insertSelective(SysPermission record);

    /**
     * selectByExample
     */
    List<SysPermission> selectByExample(SysPermissionExample example);

    /**
     * selectByPrimaryKey
     */
    SysPermission selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(SysPermission record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(SysPermission record);

    Set<String> findByUserId(int userId);
}