package com.learn.demo.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynaicProxy implements InvocationHandler {
    private Object target;
    public Object getInstanceTarget(Object target){
        this.target=target;
        Class<?> clazz =target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj =method.invoke(this.target,args);
        after();
        return obj;
    }
    private void before(){
        System.out.println("我是媒婆我要给你介绍对象");
        System.out.println("开始物色");
    }
    private void after(){
        System.out.println("如果合适就办事");
    }
}
