package com.itheima.web.servlet;

import com.itheima.entity.UserInfo;
import com.itheima.service.UserInfoService;
import com.itheima.util.AuthCodeUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.net.URLEncoder;

@WebServlet("/userInfo/*")
public class UserInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");


        //获取uri
        String requestURI = req.getRequestURI();
        String i = requestURI.substring(requestURI.lastIndexOf("/") + 1);

        try {
            //创建映射
            Class<? extends UserInfoServlet> clazz = this.getClass();
            //获取指定方法
            Method method = clazz.getDeclaredMethod(i, HttpServletRequest.class, HttpServletResponse.class);
            //跳过语言权限检查
            method.setAccessible(true);
            //调用指定方法
            method.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //登录
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //调用业务层
        UserInfoService userInfoService = new UserInfoService();
        UserInfo userInfo = userInfoService.login(username, password);
        if (userInfo != null) {
            //获取是否勾选保存密码
            String gouxuan = req.getParameter("gouxuan");
            System.out.println("gouxuan:" + gouxuan);
            System.out.println("ok.equals(gouxuan):"+"ok".equals(gouxuan));
            //System.out.println(gouxuan.equals("ok"));
            if ("ok".equals(gouxuan)) {
                //保存数据在cookie中
                Cookie usernameCooki = new Cookie("username", username);
                usernameCooki.setPath("/");
                //设置过期时间
                usernameCooki.setMaxAge(60 * 60 * 24 * 7);
                //发送cookie
                resp.addCookie(usernameCooki);

                //保存数据在cookie中
                Cookie passwordCooki = new Cookie("password", password);
                passwordCooki.setPath("/");
                //设置过期时间
                passwordCooki.setMaxAge(60 * 60 * 24 * 7);
                //发送cookie
                resp.addCookie(passwordCooki);
            } else {
                Cookie usernameCooki = new Cookie("username", "");
                usernameCooki.setPath("/");
                //设置过期时间
                usernameCooki.setMaxAge(0);
                //发送cookie
                resp.addCookie(usernameCooki);

                //保存数据在cookie中
                Cookie passwordCooki = new Cookie("password", "");
                passwordCooki.setPath("/");
                //设置过期时间
                passwordCooki.setMaxAge(0);
                //发送cookie
                resp.addCookie(passwordCooki);
            }
            req.getSession().setAttribute("userInfo", userInfo);
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("/login.jsp");
        }


    }

    //验证码生成
    protected void checkCodeImg(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //生成4位数的随机验证码
        String code = AuthCodeUtils.getRandom(4);
        //开始绘图
        AuthCodeUtils.draw(resp.getOutputStream(), code);

        req.getSession().setAttribute("code", code);
    }


    //注册
    protected void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//获取页面填写的验证码
        String yzm = req.getParameter("yzm");
        //System.out.println(yzm);
        //获取生成的验证码
        String code = (String) req.getSession().getAttribute("code");
        //System.out.println(code);
        //判断输入的验证码是否正确    equalsIgnoreCase:不区分大小写
        if (!code.equalsIgnoreCase(yzm)) {
            req.setAttribute("msc", "验证码填写错误");
            req.getRequestDispatcher("/register.jsp").forward(req, resp);
            return;
        }

        //获取数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //进行封装
        UserInfo userInfo = new UserInfo(null, username, password);
        //调用业务层
        UserInfoService userInfoService = new UserInfoService();
        try {
            int count = userInfoService.add(userInfo);
            if (count > 0) {
                resp.sendRedirect("http://localhost:8080/login.jsp");
            } else {
                resp.sendRedirect("http://localhost:8080/register.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}

