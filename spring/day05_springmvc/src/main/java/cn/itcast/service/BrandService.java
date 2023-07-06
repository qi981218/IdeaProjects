package cn.itcast.service;

import cn.itcast.pojo.Brand;
import cn.itcast.pojo.PageBean;

import java.util.List;

public interface BrandService {
    /**
     * 查询所有功能
     * @return
     */
    public List<Brand> findAll() ;

    /**
     * 添加功能
     * @param brand 添加的品牌数据
     * @return
     */
    public int add(Brand brand) ;

    /**
     * 根据id删除单个
     * @param id 要删除的id数据
     * @return
     */
    public int deleteById(int id) ;

    /**
     * 批量删除
     * @param ints id数据
     * @return
     */

    int deleteByIds(int[] ints);

    /**
     * 分页查询
     * @param currentPage 当前页
     * @param pageSize  每页的个数
     */
    PageBean<Brand> findByPage(int currentPage, int pageSize);

    /**
     * 分页加条件
     * @param currentPage 当前页
     * @param pageSize 每页个数
     * @param brand 条件列表
     * @return
     */
    PageBean<Brand> findByPageAndCondition(int currentPage, int pageSize, Brand brand);
}
