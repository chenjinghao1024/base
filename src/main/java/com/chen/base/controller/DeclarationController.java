package com.chen.base.controller;

import com.chen.base.entity.DeclarationCustomsVatRate;
import com.chen.base.entity.PageParams;
import com.chen.base.entity.TariffRate;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.DeclarationService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("declaration")
public class DeclarationController {

    @Resource
    DeclarationService declarationService;

    @GetMapping({"/index"})
    public String index(Model model) {
        return "/declaration/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<DeclarationCustomsVatRate> getListByCountryPage(PageParams params) {
        return declarationService.getListByPage(params);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ResultVO edit(DeclarationCustomsVatRate declarationCustomsVatRate) {
        try {
            declarationService.createOrUpdate(declarationCustomsVatRate);
            return ResultVO.succ();
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }
}
