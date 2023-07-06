package com.cyq.service.impl;


import com.cyq.entity.PageBean;
import com.cyq.entity.TbBrand;
import com.cyq.mapper.TbBrandMapper;
import com.cyq.service.TbBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 陈亚琪
 * @date 2022年08月12日 20:16
 * @version: 1.0
 */

@Service
public class TbBrandServiceImpl implements TbBrandService {
    @Autowired
    TbBrandMapper mapper;

    //查看所有数据
    public List<TbBrand> all() {
        return mapper.all();
    }


    //添加数据
    public int addTbBrand(TbBrand tbBrand) {
        //判断是否有数据
        if (tbBrand.getBrandName() == null || tbBrand.getBrandName().equals("")) {
            return -2;
        } else if (tbBrand.getCompanyName() == null || tbBrand.getCompanyName().equals("")) {
            return -3;
        }
        return mapper.addTbBrand(tbBrand);
    }

    //删除单条数据
    public int deleteServlet(int id) {
        return mapper.deleteServlet(id);
    }

    //修改信息
    public int updateTbBrandServlet(TbBrand tbBrand) {
        return mapper.updateTbBrandServlet(tbBrand);
    }

    //删除多条数据
    public int deleteByIds(int[] ints) {
        return mapper.deleteByIds(ints);
    }

    public PageBean pagingQuery(int pageSize, int currentPage, TbBrand tb) {
        //查询总条数
        //total:信息总条数   currentPage:当前页  pageSize:每页显示的数据条数
        int total = mapper.totalAll(tb);
        int start = (currentPage - 1) * pageSize;
        //分页查询
        List<TbBrand> tbs = mapper.pagingQuery(start, pageSize, tb);
        //封装数据
        PageBean pageBean = new PageBean(tbs, total);
        return pageBean;
    }


}
