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

<<<<<<< HEAD
    @GetMapping({"/main"})
    public String main(Model model){
        return "lyear_main";
    }

    @GetMapping({"/table"})
    public String table(Model model){
        return "lyear_ui_tables";
    }

    @GetMapping({"/table2"})
    public String table2(Model model){
        return "lyear_pages_data_table";
    }

=======
>>>>>>> 4580d34994813900b3de0b8cc1cc88349f3a03ab
    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }

}
