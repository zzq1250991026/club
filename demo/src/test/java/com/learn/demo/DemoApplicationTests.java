package com.learn.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
      Pool pool=new DBConnectionPool();
    }
    void HungryTest(){
        new HungrySingle();
    }

}
