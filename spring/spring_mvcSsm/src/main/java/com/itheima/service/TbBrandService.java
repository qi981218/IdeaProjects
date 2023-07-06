package com.itheima.service;

import com.itheima.entity.PageBean;
import com.itheima.entity.TbBrand;
import com.itheima.mapper.TbBrandMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public interface TbBrandService {
    //查看所有数据
    public List<TbBrand> all();


    //添加数据
    public int addTbBrand(TbBrand tbBrand);

    //删除单条数据
    public int deleteServlet(int id);


    //修改状态
    public boolean updateStatusServlet(int id, int status);

    public TbBrand updateSelectServlet(int id);

    //修改信息
    public int updateTbBrandServlet(TbBrand tbBrand);

    //删除多条数据
    public int deleteByIds(int[] ints);

    public PageBean pagingQuery(int pageSize, int currentPage, TbBrand tbBrand);

}
