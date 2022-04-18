package com.learn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public abstract class  Pool {
    public String propertiesName = "connection-INF.properties";
    private static Pool instance=null;
    protected  int maxConnect=100;
    protected int normalConnect=10;
    protected String driverName =null;
    protected Driver driver =null;
    protected Pool(){
        try{

        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //初始化配置信息
    private void init()throws IOException {
        //如果写一个类需要动态的获取某个文件的位置，从而能够获取此文件的资源
        InputStream is=Pool.class.getResourceAsStream(propertiesName);
        Properties p=new Properties();
        p.load(is);
        this.driverName=p.getProperty("driverName");
        this.maxConnect= Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect= Integer.parseInt(p.getProperty("normalConnect"));
    }
    //装载和注册所有JDBC驱动
    protected void loadDrivers(String driverName){
        String driverClassName=driverName;
        try{
            driver=(Driver) Class.forName(driverClassName).newInstance();
            DriverManager.registerDriver(driver);
            System.out.println("成功注册jdbc驱动");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public abstract void createPool();
    public static synchronized Pool getInstance() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if(instance==null){
            instance.init();
            instance=(Pool)Class.forName("com.learn.demo.Pool").newInstance();
        }
        return instance;
    }
    //获得一个可用连接，如果没有创建一个新链接
    public abstract Connection getConection(long time) throws SQLException, InterruptedException;
    public abstract void freeConnection(Connection connection);
    //返回空连接数
    public abstract int getnum();
    //返回当前工作的连接数
    public abstract int getnumActive();
    protected synchronized void release(){
        //撤销驱动
        try{
            DriverManager.deregisterDriver(driver);
            System.out.println("撤销JDBC驱动程序"+driver.getClass().getName());
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("无法撤销JDBC驱动程序的注册"+driver.getClass().getName());
        }
    }
}
