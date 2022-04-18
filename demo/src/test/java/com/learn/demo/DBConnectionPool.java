package com.learn.demo;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;

public class DBConnectionPool extends Pool{
    private int checkedOut;//正在使用的连接数
    private Vector<Connection> freeConnects =new Vector<Connection>();//存放产生的连接对象容器
    private String passWord=null;
    private String url=null;
    private String username=null;
    private static int num=0;
    private static int numActive=0;
    private static DBConnectionPool pool = null;
    //产生数据连接池
    public static synchronized DBConnectionPool getInstance(){
        if (pool==null){
            pool=new DBConnectionPool();
        }
        return pool;
    }
    //获得一个数据库连接的实例
    DBConnectionPool(){
        try{
            init();
            for (int i = 0;i<normalConnect;i++){
                Connection connection =newConnection();
                if(connection!=null){
                    freeConnects.addElement(connection);
                    num++;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //初始化
    private void init() throws IOException {
        InputStream is =DBConnectionPool.class.getResourceAsStream(propertiesName);
        ClassLoader.getSystemClassLoader();
        Properties p =new Properties();
        p.load(is);
        this.username=p.getProperty("username");
        this.passWord=p.getProperty("passWord");
        this.driverName=p.getProperty("driverName");
        this.url=p.getProperty("url");
        this.maxConnect= Integer.parseInt(p.getProperty("maxConnect"));
        this.normalConnect=Integer.parseInt(p.getProperty("normalConnect"));
    }
    //创建一个新连接
    private Connection newConnection() throws SQLException {
        Connection connection=null;
        try {
            if(username==null){
                connection=DriverManager.getConnection(url);
            }else {
                connection=DriverManager.getConnection(url,username,passWord);
            }
            System.out.println("连接池创建了一个新连接");
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("无法连接url"+url);
            return null;
        }
        return connection;
    }
    public synchronized Connection getConection() throws SQLException {
        Connection connection =null;
        if(freeConnects.size()>0){//还有空闲的连接
            num--;
            connection=(Connection) freeConnects.firstElement();
            freeConnects.removeElementAt(0);
            try{
                if(connection.isClosed()){
                    System.out.println("从连接池中删除了无效连接");
                    connection=getConection();
                }
            }catch (Exception e){
                System.out.println("从连接池中删除了无效连接");
                connection=getConection();
            }
        }else if (maxConnect==0||checkedOut<maxConnect){
            connection=newConnection();
        }
        if(connection!=null){
            checkedOut++;
        }
        numActive++;
        return connection;
    }
    @Override
    public synchronized Connection getConection(long timeout) throws SQLException, InterruptedException {
        long startTime =new Date().getTime();
        Connection connection;
        while ((connection=getConection())==null){
            try{
                wait(timeout);
            }catch (InterruptedException e){

            }
        }
        if((new Date().getTime()-startTime)>=timeout){
            return null;
        }
        return connection;
    }

    @Override
    public void freeConnection(Connection connection) {
        freeConnects.addElement(connection);
        num++;
        checkedOut--;
        numActive++;
        notifyAll();
    }

    @Override
    public int getnum() {
        return num;
    }

    @Override
    public int getnumActive() {
        return numActive;
    }
    //关闭所有连接
    public synchronized void release(){
        try{//将当前连接赋值到枚举中
            Enumeration allconnection = (Enumeration) freeConnects;
            while (allconnection.hasMoreElements()){
                Connection connection=(Connection) allconnection.nextElement();
                try {
                    connection.close();
                    num--;
                }catch (SQLException e){
                    System.err.println("无法关闭连接池的连接");
                }
            }
            freeConnects.removeAllElements();
            numActive=0;
        }finally {
            super.release();
        }
    }
    //创建连接池
    @Override
    public void createPool(){
        pool =new DBConnectionPool();
        if(pool!=null){
            System.out.println("创建成功");
        }else {
            System.out.println("创建失败");
        }
    }
}
