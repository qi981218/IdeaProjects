package com.itheima.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/demo1")
public class Demo1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //获取数据
        String username = req.getParameter("username");
        System.out.println(username);
        if ("lisi".equals(username)) {
            resp.getWriter().write("" + true);
        } else {
            resp.getWriter().write("" + false);
        }

    }
}

