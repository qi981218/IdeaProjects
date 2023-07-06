package com.itheima.mapper;

import com.itheima.entity.TbUser;
import org.apache.ibatis.annotations.Select;

public interface TbUserMapper {
    int addTbUser(TbUser tbUser);
}
