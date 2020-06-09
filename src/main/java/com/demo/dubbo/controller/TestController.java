package com.demo.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenxyz on 2020/6/9.
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Reference
    UserService userService;

    @RequestMapping("/login")
    public String login(String name){
       return userService.login(name);
    }
}
