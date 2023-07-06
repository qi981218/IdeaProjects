package com.cyq.service;

import com.cyq.entity.PageBean;
import com.cyq.entity.TbBrand;
import java.util.List;


public interface TbBrandService {
    //查看所有数据
    public List<TbBrand> all();


    //添加数据
    public int addTbBrand(TbBrand tbBrand);

    //删除单条数据
    public int deleteServlet(int id);


    //修改信息
    public int updateTbBrandServlet(TbBrand tbBrand);

    //删除多条数据
    public int deleteByIds(int[] ints);

    public PageBean pagingQuery(int pageSize, int currentPage, TbBrand tbBrand);

}
