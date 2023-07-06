package com.itheima.mapper;

import com.itheima.entity.TbUser;

import java.util.List;

public interface TbUserMapper {

    //查询所有信息
    List<TbUser> selectAll();

    //根据id查找信息
    TbUser selectById(Integer id);

    //使用动态sql进行查询
    List<TbUser> findall(TbUser tbUser);

    //添加数据
    int insertAll(TbUser tbUser);


    //根据id删除(批量删除)


}
