package com.itheima.service;

import com.itheima.entity.PageBean;
import com.itheima.entity.TbBrand;
import com.itheima.mapper.TbBrandMapper;
import com.itheima.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author 陈亚琪
 * @date 2022年08月12日 20:16
 * @version: 1.0
 */
public class TbBrandService {
    //查看所有数据
    public List<TbBrand> all() {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        List<TbBrand> brandList = mapper.all();
        sqlSession.commit();
        sqlSession.close();
        return brandList;
    }


    //添加数据
    public int addTbBrand(TbBrand tbBrand) {
        //判断是否有数据
        if (tbBrand.getBrandName() == null || tbBrand.getBrandName().equals("")) {
            return -2;
        } else if (tbBrand.getCompanyName() == null || tbBrand.getCompanyName().equals("")) {
            return -3;
        }
        //获取sqlsession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        int count = mapper.addTbBrand(tbBrand);
        sqlSession.commit();
        sqlSession.close();
        return count;
    }

    //删除单条数据
    public int deleteServlet(int id) {
        //获取sqlsession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        int count = mapper.deleteServlet(id);
        sqlSession.commit();
        sqlSession.close();
        return count;
    }


    //修改状态
    public boolean updateStatusServlet(int id, int status) {
        System.out.println("status=" + status);
        //获取sqlsession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        int count = mapper.updateStatusServlet(id, status);
        sqlSession.commit();
        sqlSession.close();
        if (count > 0) {
            return true;
        } else {
            return false;
        }

    }

    public TbBrand updateSelectServlet(int id) {
        //获取SqlSession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        TbBrand brand = mapper.updateSelectServlet(id);
        sqlSession.commit();
        sqlSession.close();
        return brand;
    }

    //修改信息
    public int updateTbBrandServlet(TbBrand tbBrand) {
        //获取sqlsession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        int count = mapper.updateTbBrandServlet(tbBrand);
        sqlSession.commit();
        sqlSession.close();
        return count;

    }

    //删除多条数据
    public int deleteByIds(int[] ints) {
        //获取sqlsession
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        int row = mapper.deleteByIds(ints);
        sqlSession.commit();
        sqlSession.close();
        return row;
    }

    public PageBean pagingQuery(String pageSize, String currentPage,TbBrand tbBrand) {
        //获取session
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        //查询总条数
        //total:信息总条数   currentPage:当前页  pageSize:每页显示的数据条数
        int total = mapper.totalAll(tbBrand);

        int pageS = Integer.parseInt(pageSize);
        int current = Integer.parseInt(currentPage);
        int start = (current - 1) * pageS;

        //分页查询
        List<TbBrand> tb = mapper.pagingQuery(start, pageS,tbBrand);

        //封装数据
        PageBean pageBean = new PageBean(tb, total);

        sqlSession.commit();
        sqlSession.close();
        return pageBean;
    }

    //分页查询

}
