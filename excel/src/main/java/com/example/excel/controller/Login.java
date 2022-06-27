package com.example.excel.controller;

import com.example.excel.bean.Student;
import com.example.excel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Login {
    @Autowired
    private StudentService studentService;
    @RequestMapping("login")
    public String login(){
        return "11111";
    }

    @RequestMapping("lists")
    public List<Student> lists(){
        return studentService.getStudents();
    }
}
