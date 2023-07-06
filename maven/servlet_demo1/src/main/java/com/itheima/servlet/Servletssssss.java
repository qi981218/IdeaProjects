package com.itheima.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servletssssss")
public class Servletssssss extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
//获取请求方式
        String method = req.getMethod();
        System.out.println("req.getMethod():"+method);
        //动态获取虚拟目录，以后资源跳转会用到
        String contextPath = req.getContextPath();
        System.out.println("req.getContextPath():"+contextPath);
        //获取请求的资源
        //统一资源标识符
        String requestURI = req.getRequestURI();
        System.out.println("req.getRequestURI():" + requestURI);
        //统一资源定位符，确定资源唯一，精准定位
        StringBuffer requestURL = req.getRequestURL();
        System.out.println("req.getRequestURL():" + requestURL);
        //get方式以前获取资源的方法
        String queryString = req.getQueryString();
        System.out.println("req.getQueryString():" + queryString);

    }
}

