package com.itheima.test;

import com.itheima.entity.TbUser;
import com.itheima.mapper.TbUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年08月05日 10:59
 * @version: 1.0
 */
public class TestDmo {

    //查询所有
    @Test
    public void AllSelect() throws IOException {
//1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);
        //3. 执行sql
        List<TbUser> tbUsers = mapper.selectAll();
        System.out.println(tbUsers);
        //4. 释放资源
        sqlSession.close();

    }

    @Test
    public void SelectById() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id:");
        Integer id = sc.nextInt();
        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);
        //3. 执行sql
        TbUser tbUser = mapper.selectById(id);
        System.out.println(tbUser);
        //4. 释放资源
        sqlSession.close();
    }

    //完成 接口开发 多字段查询 (动态sql查询)
    @Test
    public void FindAll() throws IOException {
        TbUser tbUser = new TbUser();
        tbUser.setUsername("zhang");
        //tbUser.setPassword("1");
        //加载mybatis核心配置文件
        String resources = "mybatis-config.xml";
        InputStream resourceAsStream = Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sessionFactory.openSession();
        TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);
        //执行sql
        List<TbUser> findall = mapper.findall(tbUser);
        System.out.println(findall);
        //释放资源
        sqlSession.close();
    }

    //添加数据
    @Test
    public void add() {
        SqlSession sqlSession = null;
        try {
            TbUser user = new TbUser();
            user.setUsername("张三");
            user.setPassword("123");
            //加载mybatis核心配置文件
            String resource = "mybatis-config.xml";
            InputStream resourceAsStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获取sqlSession和map对象
            //sqlSession = sessionFactory.openSession(true);//开启事件
            sqlSession = sessionFactory.openSession();
            TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);
            //执行sql语句
            int i = mapper.insertAll(user);
            Integer id = user.getId();
            //开启事件
           sqlSession.commit();
            System.out.println(id);
        } catch (IOException e) {
            if (sqlSession != null) {
                sqlSession.rollback();//回滚事件
            }
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }


    }

}
