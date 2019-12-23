package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.DeclarationCustomsVatRateMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DeclarationService {

    @Resource
    DeclarationCustomsVatRateMapper declarationCustomsVatRateMapper;

    public PageInfo<DeclarationCustomsVatRate> getListByPage(PageParams params) {
        DeclarationCustomsVatRateExample example = new DeclarationCustomsVatRateExample();
        DeclarationCustomsVatRateExample.Criteria criteria = example.createCriteria();
        example.setOrderByClause("country_id");

        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> declarationCustomsVatRateMapper.selectCountryByExample(example));
    }


    public void createOrUpdate(DeclarationCustomsVatRate declarationCustomsVatRate) {
        declarationCustomsVatRateMapper.updateByPrimaryKeySelective(declarationCustomsVatRate);
    }
}
