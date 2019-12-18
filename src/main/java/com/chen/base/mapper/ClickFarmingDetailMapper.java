package com.chen.base.mapper;

import com.chen.base.entity.ClickFarmingDetail;
import com.chen.base.entity.ClickFarmingDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClickFarmingDetailMapper {
    /**
     * countByExample
     */
    long countByExample(ClickFarmingDetailExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(ClickFarmingDetailExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(ClickFarmingDetail record);

    /**
     * insertSelective
     */
    int insertSelective(ClickFarmingDetail record);

    /**
     * selectByExample
     */
    List<ClickFarmingDetail> selectByExample(ClickFarmingDetailExample example);

    /**
     * selectByPrimaryKey
     */
    ClickFarmingDetail selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") ClickFarmingDetail record, @Param("example") ClickFarmingDetailExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") ClickFarmingDetail record, @Param("example") ClickFarmingDetailExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(ClickFarmingDetail record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(ClickFarmingDetail record);
}