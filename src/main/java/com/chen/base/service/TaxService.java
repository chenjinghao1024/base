package com.chen.base.service;

import com.chen.base.entity.*;
import com.chen.base.mapper.CountryMapper;
import com.chen.base.mapper.TariffRateMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TaxService {

    @Resource
    CountryMapper countryMapper;

    @Resource
    TariffRateMapper tariffRateMapper;

    public List<Country> getCountry() {
        CountryExample countryExample = new CountryExample();
        countryExample.setOrderByClause("code");
        return countryMapper.selectByExample(countryExample);
    }


    public PageInfo<TariffRate> getListByCountryPage(PageParams params) {
        TariffRateExample example = new TariffRateExample();
        TariffRateExample.Criteria criteria = example.createCriteria();
        criteria.andCountryIdEqualTo(Integer.valueOf(params.getSearchMap().get("countryId")));
        example.setOrderByClause("id");
        return PageHelper.startPage(params.getPageNumber(), params.getPageSize()).
                doSelectPageInfo(() -> tariffRateMapper.selectByExample(example));
    }

    public void createOrUpdate(TariffRate tariffRate) {
        if (tariffRate.getId() == null) {
            tariffRateMapper.insertSelective(tariffRate);
        } else {
            tariffRateMapper.updateByPrimaryKeySelective(tariffRate);
        }
    }
}
