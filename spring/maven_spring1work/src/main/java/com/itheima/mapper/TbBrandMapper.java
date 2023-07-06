package com.itheima.mapper;


import com.itheima.entity.TbBrand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TbBrandMapper {
    //查询所有信息
    @Select("select * from tb_brand")
    List<TbBrand> findAll();
}
