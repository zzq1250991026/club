package com.learn.demo.TestProtopyte;

import com.learn.demo.IEmployee;

public class Boss {
    public void commands(String command, IEmployee leader){
        leader.doing(command);
    }

    public static void main(String[] args) {
        new Boss().commands("登录",new Leader());
    }
}
