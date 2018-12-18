package com.club.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class Login {
    @RequestMapping("/club")
    public ModelAndView club(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv =new ModelAndView();
        mv.addObject("user1","你好");
        mv.setViewName("test");
        return mv;
    }
}
