package com.learn.demo.config;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
//@Lazy
public class DemoConfig {
    private Integer counter=0;
    private String name;
    public DemoConfig(){
        System.out.println("初始化加载的配置类democonfig:"+counter++);
        System.out.println(this);
    }
    public String getName() {
        if("".equals(name)){
            name="张三"+counter;
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
