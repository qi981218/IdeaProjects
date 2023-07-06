package com.itheima.dao.impl;

import com.itheima.dao.TbBrandDao;
import com.itheima.entity.TbBrand;
import com.itheima.mapper.TbBrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TbBrandDaoImpl implements TbBrandDao {

    @Autowired
    private TbBrandMapper tbBrandMapper;

    @Override
    public List<TbBrand> all() {
        return tbBrandMapper.findAll();
    }
}
