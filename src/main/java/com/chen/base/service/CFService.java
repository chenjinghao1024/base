package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.AdvertisementDetailMapper;
import com.chen.base.mapper.AdvertisementFileMapper;
import com.chen.base.mapper.ClickFarmingDetailMapper;
import com.chen.base.mapper.ClickFarmingInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CFService {

    @Resource
    ClickFarmingInfoMapper clickFarmingInfoMapper;
    @Resource
    ClickFarmingDetailMapper clickFarmingDetailMapper;

    public PageInfo<ClickFarmingInfo> getListByPage(PageParams params) {

        ClickFarmingInfoExample example = new ClickFarmingInfoExample();
        ClickFarmingInfoExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id");
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> clickFarmingInfoMapper.selectByExample(example));
    }

    public PageInfo<ClickFarmingDetail> getPackingDetailsByPage(PageParams params) {

        ClickFarmingDetailExample example = new ClickFarmingDetailExample();
        ClickFarmingDetailExample.Criteria criteria = example.createCriteria();
        String infoId = params.getSearchMap().get("infoId");
        criteria.andInfoIdEqualTo(Integer.valueOf(infoId));
        example.setOrderByClause("id");

        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> clickFarmingDetailMapper.selectByExample(example));
    }
}
