package com.learn.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*@MapperScans(
        @MapperScan(basePackages = SystemCst.BASE_PACKAGE,
                sqlSessionTemplateRef = SystemCst.SQL_SESSION_TEMPLATE)*/
@MapperScans({@MapperScan("com.learn.demo.mapper.*"),@MapperScan("com.learn.demo.dao")})
public class DemoApplication {
    public static void main(String[] args) {
        String [] a={"",""};
        SpringApplication.run(DemoApplication.class, args);
    }

}
