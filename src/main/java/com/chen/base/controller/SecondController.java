package com.chen.base.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 */
@RestController
@RequestMapping("/second")
public class SecondController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello first";
    }
}
