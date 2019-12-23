package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.AdvertisementDetailMapper;
import com.chen.base.mapper.AdvertisementFileMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdvService {

    @Resource
    AdvertisementFileMapper advertisementFileMapper;
    @Resource
    AdvertisementDetailMapper advertisementDetailMapper;

    public PageInfo<AdvertisementFile> getListByPage(PageParams params) {

        AdvertisementFileExample example = new AdvertisementFileExample();
        AdvertisementFileExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id");
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> advertisementFileMapper.selectByExample(example));
    }

    public PageInfo<AdvertisementDetail> getPackingDetailsByPage(PageParams params) {

        AdvertisementDetailExample example = new AdvertisementDetailExample();
        AdvertisementDetailExample.Criteria criteria = example.createCriteria();
        String infoId = params.getSearchMap().get("infoId");
        criteria.andAdvertisementFileIdEqualTo(Integer.valueOf(infoId));
        example.setOrderByClause("id");

        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> advertisementDetailMapper.selectByExample(example));
    }
}
