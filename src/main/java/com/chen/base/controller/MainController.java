package com.chen.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 控制器 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 * @author SpringBoot
 */
@Controller
public class MainController {

    @GetMapping({"/","/index"})
    public String index(Model model){
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

}
