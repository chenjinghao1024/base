package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.PackingDetailMapper;
import com.chen.base.mapper.PackingInfoMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PackingService {

    @Resource
    PackingInfoMapper packingInfoMapper;
    @Resource
    PackingDetailMapper packingDetailMapper;

    public PageInfo<PackingInfo> getPackingFilesByPage(PageParams params) {

        PackingInfoExample example = new PackingInfoExample();
        PackingInfoExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("id");
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> packingInfoMapper.selectAndWarehouseByExample(example));
    }

    public PageInfo<PackingDetail> getPackingDetailsByPage(PageParams params) {

        PackingDetailExample example = new PackingDetailExample();
        PackingDetailExample.Criteria criteria = example.createCriteria();
        String infoId = params.getSearchMap().get("infoId");
        criteria.andPackingInfoIdEqualTo(Integer.valueOf(infoId));
        example.setOrderByClause("id");
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> packingDetailMapper.selectByExample(example));
    }

}
