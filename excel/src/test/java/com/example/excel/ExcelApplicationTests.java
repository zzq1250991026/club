package com.example.excel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExcelApplicationTests {

    @Test
    void contextLoads() {
        User user = new User();
        System.out.println(user.getClass().getDeclaredFields());
        System.out.println(user);
    }

}
