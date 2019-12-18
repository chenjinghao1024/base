package com.chen.base.mapper;

import com.chen.base.entity.ClickFarmingInfo;
import com.chen.base.entity.ClickFarmingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClickFarmingInfoMapper {
    /**
     * countByExample
     */
    long countByExample(ClickFarmingInfoExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(ClickFarmingInfoExample example);

    /**
     * insert
     */
    int insert(ClickFarmingInfo record);

    /**
     * insertSelective
     */
    int insertSelective(ClickFarmingInfo record);
    int insertSelectiveReturnId(ClickFarmingInfo record);

    /**
     * selectByExample
     */
    List<ClickFarmingInfo> selectByExample(ClickFarmingInfoExample example);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") ClickFarmingInfo record, @Param("example") ClickFarmingInfoExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") ClickFarmingInfo record, @Param("example") ClickFarmingInfoExample example);
}
