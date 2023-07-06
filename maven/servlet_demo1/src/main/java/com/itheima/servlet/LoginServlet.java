package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginServlet.service");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        //获取参数
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username:" + username + "password:" + password);
        //获取一个键对应多个值
        String[] hobbies = req.getParameterValues("hobby");
        System.out.println("hobby:"+hobbies);
        for (String hobby : hobbies) {
            System.out.println("hobby循环:"+hobby);
        }

        //获取所有的参数
        Map<String, String[]> map = req.getParameterMap();
        Set<String> keys = map.keySet();
        for (String key : keys) {
            String[] values = map.get(key);
            System.out.println(key+"::"+ Arrays.toString(values));
        }

        req.getRequestDispatcher("/home.html").forward(req,resp);

    }
}
