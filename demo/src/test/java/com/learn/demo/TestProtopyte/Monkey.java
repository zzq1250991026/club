package com.learn.demo.TestProtopyte;

import java.util.Date;

public class Monkey {
    public int height;
    public int weight;
    public Date birthdate;
    protected Object clone() throws CloneNotSupportedException{
        return EnumSingleton.INSTANCE;
    }
}
enum EnumSingleton{
    INSTANCE;
    private Object object;
    public Object getObject() {
        return object;
    }
    public void setObject(Object o){
        this.object=o;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
