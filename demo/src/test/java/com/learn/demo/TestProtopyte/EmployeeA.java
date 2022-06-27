package com.learn.demo.TestProtopyte;

import com.learn.demo.IEmployee;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A"+"现在开始干"+command);
    }
}
