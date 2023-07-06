package cn.itcast.controller;

import cn.itcast.pojo.Brand;
import cn.itcast.pojo.PageBean;
import cn.itcast.service.BrandService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @Autowired
    private BrandService bs;

    @PostMapping("/{currentPage}/{pageSize}")
    public PageBean<Brand> findByPageAndCondition(@PathVariable int currentPage,@PathVariable int pageSize,@RequestBody Brand brand) throws ServletException, IOException {
        //3.调用业务层操作数据
        PageBean<Brand> pb = bs.findByPageAndCondition(currentPage,pageSize,brand);
        return pb;
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public PageBean<Brand> findByPage(@PathVariable int currentPage, @PathVariable int pageSize) throws ServletException, IOException {
        //2.调用业务层去查(1.总条数 2.该页的数据)
        PageBean<Brand> pb = bs.findByPage(currentPage, pageSize);
        return pb;
    }

    @DeleteMapping
    public String deleteByIds(@RequestBody int[] ids) throws ServletException, IOException {
        int row = bs.deleteByIds(ids);
        return row+"";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) throws ServletException, IOException {

        int row = bs.deleteById(id);
        return row+"";

    }

    @PostMapping
    public String add(@RequestBody Brand brand) throws ServletException, IOException {
        //3.交给业务层处理
        int row = bs.add(brand);//97
        //4.将结果返回给页面
        return row+"";
    }

    @GetMapping
    public List<Brand> findAll() throws ServletException, IOException {
        //1.调用service层去查询数据
        List<Brand> list = bs.findAll();
        return list;
    }


}
