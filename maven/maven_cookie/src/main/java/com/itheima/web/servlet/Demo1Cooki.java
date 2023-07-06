package com.itheima.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 陈亚琪
 * @date 2022年08月14日 11:47
 * @version: 1.0
 */
@WebServlet("/user/demo1")
public class Demo1Cooki extends HttpServlet {
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Cookie cookie = new Cookie("chenyaqi", "王者");
        cookie.setPath("/");
        res.addCookie(cookie);

        req.getSession().setAttribute("username","123");
    }
}
