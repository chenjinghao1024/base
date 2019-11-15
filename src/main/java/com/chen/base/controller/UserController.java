package com.chen.base.controller;

import com.chen.base.entity.PageParams;
import com.chen.base.entity.SysUser;
import com.chen.base.entity.vo.ResultVO;
import com.chen.base.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    UserService userService;

    @GetMapping({"/index"})
    public String index(Model model){
        return "user/user_table";
    }

    @ResponseBody
    @RequestMapping("/list")
    public PageInfo<SysUser> getUsersByPage(PageParams params) {
        return userService.getUsersByPage(params);
    }

    @ResponseBody
    @RequestMapping("/changeStatus")
    public ResultVO editUser(Integer pk, Byte value) {
        return userService.changeStatus(pk, value);
    }

    @ResponseBody
    @RequestMapping("/createOrEditUser")
    public ResultVO createOrEditUser(SysUser user) {
        return userService.createOrEditUser(user);
    }

    @ResponseBody
    @RequestMapping("/getById")
    public ResultVO getUserById(Integer id) {
        try {
            SysUser user = userService.getUserById(id);
            return ResultVO.succ().data(user);
        } catch (Exception e) {
            return ResultVO.fail();
        }
    }

}
