package com.itheima.controller;

import com.itheima.entity.PageBean;
import com.itheima.entity.TbBrand;
import com.itheima.service.TbBrandService;
import com.itheima.service.impl.TbBrandServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@RestController
@RequestMapping("/brands")
public class TbBrandController {

    @Autowired
    TbBrandService tbBrandService;


    //分页查询
    @PostMapping("/{currentPage}/{pageSize}")
    private PageBean pagingQuery(@PathVariable int pageSize, @PathVariable int currentPage, @RequestBody TbBrand tb) throws ServletException, IOException {
        return tbBrandService.pagingQuery(pageSize, currentPage, tb);
    }


    @DeleteMapping
    //删除多条数据
    private int deleteByIds(@RequestBody int[] ids) throws ServletException, IOException {
        return tbBrandService.deleteByIds(ids);
    }


    //添加数据
    @PutMapping
    private int addTbBrandServlet(@RequestBody TbBrand tbBrand) throws ServletException, IOException {
        return tbBrandService.addTbBrand(tbBrand);
    }


    //删除数据
    @DeleteMapping("/{id}")
    private int deleteServlet(@PathVariable int id) throws ServletException, IOException {
        return tbBrandService.deleteServlet(id);
    }

    @PatchMapping
    //修改页面
    private int updateTbBrandServlet(@RequestBody TbBrand tbBrand) throws ServletException, IOException {
        return tbBrandService.updateTbBrandServlet(tbBrand);
    }

}
