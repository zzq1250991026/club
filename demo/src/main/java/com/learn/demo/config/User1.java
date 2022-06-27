package com.learn.demo.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
//@Lazy
@Scope("prototype")
public class User1 {
    private String name;
    private Integer count=0;
    public User1(){
        System.out.println("这是user1:"+count+++""+new SimpleDateFormat().format(new Date(System.currentTimeMillis())));
    }
    public String getName() {
        if("".equals(name)||name==null){
            name="张三"+count;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}