package com.itheima.web.servlet;

import com.alibaba.fastjson.JSON;
import com.itheima.entity.PageBean;
import com.itheima.entity.TbBrand;
import com.itheima.service.TbBrandService;
import org.aspectj.weaver.ast.Var;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@WebServlet("/tbBrand/*")
public class TbBrandServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //拿到请求的urI
        String requestURI = req.getRequestURI();
        //我们只需要/tbBrand后的数据
        int i = requestURI.lastIndexOf("/");
        //进行截取
        String substring = requestURI.substring(i + 1);

        try {
            //创建反射
            Class clazz = this.getClass();
            //获取指定方法
            Method method = clazz.getDeclaredMethod(substring, HttpServletRequest.class, HttpServletResponse.class);
            //跳过权限检查
            method.setAccessible(true);
            //调用方法
            method.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //分页查询
    private void pagingQuery(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端发送过来的数据
//        pageSize:每页显示的数据条数   currentPage:当前页
        String pageSize = req.getParameter("pageSize");
        String currentPage = req.getParameter("currentPage");

        //接收条件数据
        String searchForm = req.getReader().readLine();
        //转为Java类型
        TbBrand tbBrand = JSON.parseObject(searchForm, TbBrand.class);
        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        PageBean pageBean = tbBrandService.pagingQuery(pageSize, currentPage, tbBrand);
        //将数据转为json并返回

        String pb = JSON.toJSONString(pageBean);
        resp.getWriter().write(pb + "");

    }

    //删除多条数据
    private void deleteByIds(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端页面发送过来的数据
        String s = req.getReader().readLine();
        //将其转换为队形的数据类型
        int[] ints = JSON.parseObject(s, int[].class);
        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        int row = tbBrandService.deleteByIds(ints);
        resp.getWriter().write(row + "");
    }


    //查找所有数据
    private void allServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        List<TbBrand> brandList = tbBrandService.all();
        //将数据转换为json
        String s = JSON.toJSONString(brandList);
        //3.响应给页面
        resp.getWriter().write(s);
    }

    //添加数据
    private void addTbBrandServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前端发送过来的json数据并将其转换为TbBrand类型
        String s = req.getReader().readLine();
        TbBrand tbBrand = JSON.parseObject(s, TbBrand.class);
        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        int i = tbBrandService.addTbBrand(tbBrand);
        //4.将结果返回给页面
        resp.getWriter().write(i + "");
        //获取数据
//        String brandName = req.getParameter("brandName");
//        String companyName = req.getParameter("companyName");
//        String description = req.getParameter("description");
//        String status = req.getParameter("status");
//
//
//        //判断公司名称，品牌，描述是否为空
//        if (!brandName.equals("") && !companyName.equals("") && !description.equals("")) {
//            //封装数据
//            TbBrand tbBrand = new TbBrand(null, brandName, companyName, null, description, Integer.parseInt(status));
//            //调用业务层
//            TbBrandService tbBrandService = new TbBrandService();
//            try {
//                boolean falg = tbBrandService.addTbBrand(tbBrand);
//                //判断是否添加成功
//                if (falg) {
//                    System.out.println("添加成功！");
//                    //跳转到home页面
//                    resp.sendRedirect(req.getContextPath() + "/tbBrand/allServlet");
//                } else {
//                    System.out.println("添加失败！");
//                    req.setAttribute("msc", "添加失败");
//                    req.getRequestDispatcher("/addTbBrand.jsp").forward(req, resp);
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.out.println("添加失败！");
//            req.setAttribute("msc", "添加失败");
//            req.getRequestDispatcher("/addTbBrand.jsp").forward(req, resp);
//        }

    }


    //删除数据
    private void deleteServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        String id = req.getParameter("id");
        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        int count = tbBrandService.deleteServlet(Integer.parseInt(id));
        resp.getWriter().write(count + "");
    }

    //修改页面的查找
    private void updateSelectServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        String id = req.getParameter("id");
        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        TbBrand tbBrand = tbBrandService.updateSelectServlet(Integer.parseInt(id));
        req.setAttribute("tbBrand", tbBrand);
        req.getRequestDispatcher("/update.jsp").forward(req, resp);
    }


    //修改页面
    private void updateTbBrandServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        String line = req.getReader().readLine();
        TbBrand tbBrand = JSON.parseObject(line, TbBrand.class);

        //判断公司名称，品牌，描述是否为空

        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        int count = tbBrandService.updateTbBrandServlet(tbBrand);
        resp.getWriter().write(count + "");

    }


    //修改状态
    private void updateStatusServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        String id = req.getParameter("id");
        String status = req.getParameter("status");
        System.out.println("status=" + status);

        //调用业务层
        TbBrandService tbBrandService = new TbBrandService();
        try {
            boolean falg = tbBrandService.updateStatusServlet(Integer.parseInt(id), Integer.parseInt(status));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //是否启用成功都会跳回主页面
        resp.sendRedirect("http://localhost:8080/tbBrand/allServlet");
    }


}

