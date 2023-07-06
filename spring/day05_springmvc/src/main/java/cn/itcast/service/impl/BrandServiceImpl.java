package cn.itcast.service.impl;

import cn.itcast.mapper.BrandMapper;
import cn.itcast.pojo.Brand;
import cn.itcast.pojo.PageBean;
import cn.itcast.service.BrandService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    public List<Brand> findAll() {
        return brandMapper.findAll();
    }

    public int add(Brand brand) {
        if (brand.getBrandName() == null || brand.getBrandName().equals("")) {
            return -2;
        }
        if (brand.getCompanyName() == null || brand.getCompanyName().equals("")) {
            return -3;
        }
        return brandMapper.add(brand);
    }

    public int deleteById(int id) {
        return brandMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(int[] ids) {

        return brandMapper.deleteByIds(ids);
    }

    @Override
    public PageBean findByPage(int currentPage, int pageSize) {
        //1.查总条数
        int totalCount = brandMapper.getTotalCount();
        //2.查询当前页的数据===> limit  开始的索引, 每页的个数

        int start = (currentPage - 1) * pageSize;
        List<Brand> list = brandMapper.findByPageData(start, pageSize);
        //3.将两个数据打包成一个
        PageBean<Brand> pb = new PageBean<>(totalCount, list);
        return pb;

    }

    @Override
    public PageBean<Brand> findByPageAndCondition(int currentPage, int pageSize, Brand brand) {
        //1.查总条数
        int totalCount = brandMapper.getTotalCountWithCondition(brand);
        //2.查询当前页的数据===> limit  开始的索引, 每页的个数

        int start = (currentPage - 1) * pageSize;
        List<Brand> list = brandMapper.findByPageDataWithCondition(start, pageSize, brand);
        //3.将两个数据打包成一个
        PageBean<Brand> pb = new PageBean<>(totalCount, list);
        return pb;

    }
}
