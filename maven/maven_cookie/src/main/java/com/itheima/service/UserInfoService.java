package com.itheima.service;

import com.itheima.entity.UserInfo;
import com.itheima.mapper.UserInfoMapper;
import com.itheima.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * @author 陈亚琪
 * @date 2022年08月14日 16:25
 * @version: 1.0
 */
public class UserInfoService {

    //登录
    public UserInfo login(String username, String password) {
        //获取session
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        UserInfo userInfo = mapper.login(username, password);

        sqlSession.commit();
        sqlSession.close();
        return userInfo;
    }

    public int add(UserInfo userInfo) {
        //获取session
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        int rows = mapper.add(userInfo);


        sqlSession.commit();
        sqlSession.close();
        return rows;
    }
}
