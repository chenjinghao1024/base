package com.chen.base.controller;

import com.chen.base.entity.CurrencyRate;
import com.chen.base.entity.PageParams;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.CurrencyService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("currency")
public class CurrencyController {

    @Resource
    CurrencyService currencyService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "currency/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<CurrencyRate> getByPage(PageParams params) {
        return currencyService.getCurrencyRatesByPage(params);
    }

    @ResponseBody
    @RequestMapping("/getByPrimaryKey")
    public ResultVO getByPrimaryKey(String currencyCode) {
        try {
            CurrencyRate currencyRate = currencyService.getByPrimaryKey(currencyCode);
            return ResultVO.succ().data(currencyRate);
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ResultVO edit(CurrencyRate currencyRate) {
        try {
            currencyService.edit(currencyRate);
            return ResultVO.succ().data(currencyRate);
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

}
