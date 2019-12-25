package com.chen.base.controller;

import com.chen.base.entity.CurrencyRate;
import com.chen.base.entity.PageParams;
import com.chen.base.entity.TariffRate;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.TaxService;
import com.chen.base.service.UtilServcie;
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
@RequestMapping("/tax")
public class TaxController {

    @Resource
    TaxService taxService;
    @Resource
    UtilServcie utilServcie;
    @GetMapping({"/index"})
    public String index(Model model) {
        model.addAttribute("countries",utilServcie.getCountry());
        return "/tax/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<TariffRate> getListByCountryPage(PageParams params) {
        return taxService.getListByCountryPage(params);
    }


    @ResponseBody
    @RequestMapping("/createOrUpdate")
    public ResultVO edit(TariffRate tariffRate) {
        try {
            taxService.createOrUpdate(tariffRate);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }


}
