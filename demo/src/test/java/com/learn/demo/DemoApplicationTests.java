package com.learn.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.DependencyDescriptor;
import org.springframework.beans.factory.config.NamedBeanHolder;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ResolvableType;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.util.Properties;
import java.util.Set;

@SpringBootTest
class DemoApplicationTests {

    public String propertiesName = "connection-INF.properties";
    private static Pool instance=null;
    protected  int maxConnect=100;
    protected int normalConnect=10;
    protected String driverName =null;
    protected Driver driver =null;
    @Test
    void contextLoads() {
      Pool pool=new DBConnectionPool();
    }
    void HungryTest() {
        new HungrySingle();
        new AbstractAutowireCapableBeanFactory() {
            @Override
            public <T> T getBean(Class<T> aClass) throws BeansException {
                return null;
            }

            @Override
            public <T> T getBean(Class<T> aClass, Object... objects) throws BeansException {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(Class<T> aClass) {
                return null;
            }

            @Override
            public <T> ObjectProvider<T> getBeanProvider(ResolvableType resolvableType) {
                return null;
            }

            @Override
            protected boolean containsBeanDefinition(String s) {
                return false;
            }

            @Override
            protected BeanDefinition getBeanDefinition(String s) throws BeansException {
                return null;
            }

            @Override
            public <T> NamedBeanHolder<T> resolveNamedBean(Class<T> aClass) throws BeansException {
                return null;
            }

            @Override
            public Object resolveDependency(DependencyDescriptor dependencyDescriptor, String s, Set<String> set, TypeConverter typeConverter) throws BeansException {
                return null;
            }
        };
    }
    @Test
    void H() throws NoSuchMethodException, IOException {
        //如果写一个类需要动态的获取某个文件的位置，从而能够获取此文件的资源
        InputStream is=Pool.class.getClassLoader().getResourceAsStream(propertiesName);
        Properties p=new Properties();
        p.load(is);
        this.driverName=p.getProperty("driverName");
        this.maxConnect= Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect= Integer.parseInt(p.getProperty("normalConnect"));
        System.out.println(driverName);
        System.out.println(maxConnect);
        System.out.println(normalConnect);
    }

}
