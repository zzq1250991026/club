package com.learn.demo.TestProtopyte;

import com.learn.demo.IEmployee;

import java.util.HashMap;

public class Leader implements IEmployee {
    private HashMap<String, IEmployee> target =new HashMap<String,IEmployee>();
    public Leader(){
        target.put("加密",new EmployeeA());
        target.put("登录",new EmployeeB());
    }
    @Override
    public void doing(String command) {
        target.get(command).doing(command);
    }
}
