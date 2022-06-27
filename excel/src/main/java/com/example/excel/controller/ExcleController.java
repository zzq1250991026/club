package com.example.excel.controller;

import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
@Controller
public class ExcleController {
    /**
     * 读取 excel
     * @return
     */
    @PostMapping("upload")
    @ResponseBody
    public String upload(MultipartFile file) throws IOException {
        EasyExcel.read();

        return "success";
    }
    @GetMapping("hello")
    public String index(){
        return "hello";
    }
    @RequestMapping("eeee")
    public String H(){
        return "111";
    }
}
