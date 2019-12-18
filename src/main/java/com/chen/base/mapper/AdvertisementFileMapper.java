package com.chen.base.mapper;

import com.chen.base.entity.AdvertisementFile;
import com.chen.base.entity.AdvertisementFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AdvertisementFileMapper {
    /**
     * countByExample
     */
    long countByExample(AdvertisementFileExample example);

    /**
     * deleteByExample
     */
    int deleteByExample(AdvertisementFileExample example);

    /**
     * deleteByPrimaryKey
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert
     */
    int insert(AdvertisementFile record);

    /**
     * insertSelective
     */
    int insertSelective(AdvertisementFile record);
    int insertSelectiveReturnId(AdvertisementFile record);

    /**
     * selectByExample
     */
    List<AdvertisementFile> selectByExample(AdvertisementFileExample example);

    /**
     * selectByPrimaryKey
     */
    AdvertisementFile selectByPrimaryKey(Integer id);

    /**
     * updateByExampleSelective
     */
    int updateByExampleSelective(@Param("record") AdvertisementFile record, @Param("example") AdvertisementFileExample example);

    /**
     * updateByExample
     */
    int updateByExample(@Param("record") AdvertisementFile record, @Param("example") AdvertisementFileExample example);

    /**
     * updateByPrimaryKeySelective
     */
    int updateByPrimaryKeySelective(AdvertisementFile record);

    /**
     * updateByPrimaryKey
     */
    int updateByPrimaryKey(AdvertisementFile record);
}
