package com.chen.base.controller;

import com.chen.base.entity.PageParams;
import com.chen.base.entity.SysUser;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/tax")
public class TaxController {

    @GetMapping({"/index"})
    public String index(Model model) {
        return "tax/index";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<SysUser> getUsersByPage(PageParams params) {
        return null;
    }

}
