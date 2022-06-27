package com.learn.demo.Proxy;

import java.io.Serializable;
import java.util.Date;
//先继承后是实现
public class Son extends Date implements Person, Serializable{
    @Override
    public void findLove() {
        System.out.println("肤白貌美大长腿");
    }
}
