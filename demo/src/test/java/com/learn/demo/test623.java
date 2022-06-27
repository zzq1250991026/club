package com.learn.demo;

import com.learn.demo.controller.Login;
import com.learn.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@RunWith(SpringRunner.class)
@WebMvcTest(Login.class)
@SpringBootTest(classes = DemoApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test623 {
    @Autowired
    private MockMvc mvc;
    @Autowired
    private StudentService studentService;
    @Test
    public void testLogin(@Autowired MockMvc mvc)throws Exception{
        MockHttpServletRequestBuilder requestBuilder =
                MockMvcRequestBuilders.get("/lists");
        ResultActions actions=mvc.perform(requestBuilder);
        System.out.println(actions);
    }
}
