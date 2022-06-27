package com.learn.demo.controller;

import com.learn.demo.config.DemoConfig;
import com.learn.demo.config.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
//@Lazy
public class test {
    @Resource
    private User1 user1;
    @Autowired
    private DemoConfig demoConfig;
    @GetMapping("test")
    public void test(){
        DemoConfig d1=(DemoConfig)Until.getBean(DemoConfig.class);
        DemoConfig d2=(DemoConfig)Until.getBean(DemoConfig.class);
        Login L1=(Login) Until.getBean("login");
        Login L2=(Login) Until.getBean("login");
        System.out.println(L1);
        System.out.println(L2);
        System.out.println(user1.getName());

    }
}
