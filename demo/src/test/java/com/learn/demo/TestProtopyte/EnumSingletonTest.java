package com.learn.demo.TestProtopyte;

import java.io.*;

public class EnumSingletonTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EnumSingleton enumSingleton =null;
        EnumSingleton enumsingleton2=EnumSingleton.getInstance();
        enumsingleton2.setObject(new Object());
        FileOutputStream fos= new FileOutputStream("EnumSingleton.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(enumsingleton2);
        oos.flush();
        oos.close();
        FileInputStream fis=new FileInputStream("EnumSingleton.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);
        enumSingleton=(EnumSingleton)ois.readObject();
        ois.close();
        System.out.println(enumSingleton.getObject());
        System.out.println(enumsingleton2.getObject()==enumSingleton.getObject());
        System.out.println(enumsingleton2.getObject());
        System.out.println(enumsingleton2.getObject().equals(enumSingleton.getObject()));
    }
}
