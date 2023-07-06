package com.itheima.servlet;

import com.itheima.entity.TbUser;
import com.itheima.mapper.TbUserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.InputStream;

@WebServlet("/addTbUserServlet")
public class AddTbUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        //获取数据
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username:" + username + ",password" + password);

        //封装数据
        TbUser tbUser = new TbUser(null,username,password);
        //加载mybatis配置文件
        InputStream resource = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resource);
        SqlSession sqlSession = build.openSession();
        //获取mapper对象
        TbUserMapper mapper = sqlSession.getMapper(TbUserMapper.class);

        //执行sql语句
        int i = mapper.addTbUser(tbUser);
        //获取id
        Integer id = tbUser.getId();

        //提交事件(增删改)
        sqlSession.commit();
        sqlSession.close();

        //请求转发
        req.setAttribute("tbUser",tbUser);
        req.getRequestDispatcher("home.html").forward(req,resp);




    }
}

