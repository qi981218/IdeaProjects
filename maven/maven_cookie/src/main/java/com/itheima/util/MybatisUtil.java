package com.itheima.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author 陈亚琪
 * @date 2022年08月12日 20:07
 * @version: 1.0
 */
public class MybatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        //加载mybatis配置(只加载一次)
        try {
            InputStream resource = Resources.getResourceAsStream("mybatis.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //2.提供一个获取SqlSession的方法
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
