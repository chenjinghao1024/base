package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.CurrencyRateMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CurrencyService {

    @Resource
    CurrencyRateMapper currencyRateMapper;

    public PageInfo<CurrencyRate> getCurrencyRatesByPage(PageParams params) {

        CurrencyRateExample example = new CurrencyRateExample();
        CurrencyRateExample.Criteria criteria = example.createCriteria();

        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> currencyRateMapper.selectByExample(example));
    }

    public CurrencyRate getByPrimaryKey(String currencyCode) {
        return currencyRateMapper.selectByPrimaryKey(currencyCode);
    }

    public void edit(CurrencyRate currencyRate) {
        currencyRateMapper.updateByPrimaryKeySelective(currencyRate);
    }
}
