package com.itheima.reggie.filter;

import com.alibaba.fastjson.JSON;
import com.itheima.reggie.common.R;
import com.itheima.reggie.util.BaseContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
通过过滤器进行登录检查
 */
@WebFilter(filterName = "LoginCheckFilter", urlPatterns = "/*")
@Slf4j
public class LoginCheckFilter implements Filter {
    //路径匹配器   支持通配符
    private static final AntPathMatcher PATH_MATCHER = new AntPathMatcher();

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //获取本次请求的uri
        String requestURI = request.getRequestURI();
        log.info("拦截到请求:{}", requestURI);
        //定义不需要处理的请求路径
        String[] urls = new String[]{
                "/employee/login",
                "/employee/logout",
                "/backend/**",
                "/front/**"
        };
        Boolean check = check(urls, requestURI);

        //如果不需要处理就放行
        if (check) {
            log.info("本次请求不需要处理，请求路径为:{}", requestURI);
            filterChain.doFilter(request, response);
            return;
        }
        //需要处理
        //判断是否登录，已登录则放行
        if (request.getSession().getAttribute("em") != null) {
            log.info("用户已登录，id为：{}", request.getSession().getAttribute("em"));

            //获取用户id
            Long emId = (Long) request.getSession().getAttribute("em");

            //将用户id存到线程
            BaseContext.setCurrentId(emId);
            filterChain.doFilter(request, response);
            return;
        }


        log.info("用户未登录");
        //未登录则通过输出流的方式进行响应
        response.getWriter().write(JSON.toJSONString(R.error("NOTLOGIN")));
        return;

    }


    /**
     * 路径匹配，检查本次请求是否需要放行
     *
     * @param urls
     * @param requestURI
     * @return
     */
    public Boolean check(String[] urls, String requestURI) {
        //遍历路径并进行匹配
        for (String url : urls) {
            boolean match = PATH_MATCHER.match(url, requestURI);
            if (match) {
                return true;
            }
        }
        return false;
    }


}

