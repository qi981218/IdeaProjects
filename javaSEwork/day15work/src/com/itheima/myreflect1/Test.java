package com.itheima.myreflect1;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @author 陈亚琪
 * @date 2022年07月28日 18:20
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        //获取系统能够类加载器
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        //使用加载器加载pro.properties文件并进行读取
        InputStream is = loader.getResourceAsStream("prop.properties");
        Properties pro = new Properties();
        pro.load(is);
        System.out.println(pro);
        //关闭资源
        is.close();
        //获取class对象
        Class clazz = Class.forName("com.itheima.myreflect1.Worker");
        //获取构造方法
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        //创建work对象
        Worker worker = (Worker) clazz.newInstance();
        //调用worker里面的方法
        worker.work();

    }
}
