package com.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*Your ApplicationContext is unlikely to start due to a @ComponentScan of the default package错误。
* 启动类放到了java包下,如果需要解决用@ComponentScan
* excludeFilters 和 includeFilters 的使用
* 使用 excludeFilters 来按照规则排除某些包的扫描
* */
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
