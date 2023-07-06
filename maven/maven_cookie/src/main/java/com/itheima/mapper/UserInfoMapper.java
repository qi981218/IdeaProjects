package com.itheima.mapper;

import com.itheima.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 陈亚琪
 * @date 2022年08月14日 16:24
 * @version: 1.0
 */
public interface UserInfoMapper {

    //登录
    @Select("select * from user_info where username=#{username} and password=#{password}")
    UserInfo login(@Param("username") String username, @Param("password") String password);


    //注册
    @Insert("insert into user_info(username,password) values (#{username},#{password})")
    int add(UserInfo userInfo);
}
