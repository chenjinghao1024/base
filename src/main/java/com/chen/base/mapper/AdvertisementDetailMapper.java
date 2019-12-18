package com.chen.base.mapper;

import com.chen.base.entity.AdvertisementDetail;
import com.chen.base.entity.AdvertisementDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdvertisementDetailMapper {
    /**
     * countByExample
     */
    long countByExample(AdvertisementDetailExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(AdvertisementDetailExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(AdvertisementDetail record);

    /**
     * insertSelective
     */
    int insertSelective(AdvertisementDetail record);

    /**
     * selectByExample
     */
    List<AdvertisementDetail> selectByExample(AdvertisementDetailExample example);

    /**
     * selectByPrimaryKey
     */
    AdvertisementDetail selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") AdvertisementDetail record, @Param("example") AdvertisementDetailExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") AdvertisementDetail record, @Param("example") AdvertisementDetailExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(AdvertisementDetail record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(AdvertisementDetail record);
}