package com.chen.base.service;

import com.chen.base.entity.Country;
import com.chen.base.entity.CountryExample;
import com.chen.base.entity.CurrencyRate;
import com.chen.base.entity.CurrencyRateExample;
import com.chen.base.mapper.CountryMapper;
import com.chen.base.mapper.CurrencyRateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UtilServcie {

    @Resource
    CountryMapper countryMapper;
    @Resource
    CurrencyRateMapper currencyRateMapper;

    public List<Country> getCountry() {
        CountryExample countryExample = new CountryExample();
        countryExample.setOrderByClause("code");
        return countryMapper.selectByExample(countryExample);
    }

    public List<CurrencyRate> getCurrencyRate(){

        CurrencyRateExample currencyRateExample = new CurrencyRateExample();
        currencyRateExample.setOrderByClause("currency_code");
        return currencyRateMapper.selectByExample(currencyRateExample);
    }
}
