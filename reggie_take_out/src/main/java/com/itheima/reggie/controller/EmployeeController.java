package com.itheima.reggie.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;

/**
 * <p>
 * 员工信息 前端控制器
 * </p>
 *
 * @author 陈亚琪
 * @since 2022-09-03
 */
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    public static final String INIT_PWD = "123456";

    /**
     * 员工登录
     *
     * @param request
     * @param employee
     * @return
     */
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee) {
        log.info("登录");
        //1.将提交的密码进行m5加密
        String password = employee.getPassword();
        //使用DigestUtils工具类的md5DigestAsHex方法进行加密
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        //2.根据用户提交的用户名username查询数据库
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        //设置查找条件
        queryWrapper.eq(Employee::getUsername, employee.getUsername());
        //进行查找
        Employee em = employeeService.getOne(queryWrapper);
//简单写法
//employeeService.getOne(Wrappers.<Employee>lambdaQuery().eq(Employee::getUsername, employee.getUsername()));
//判断是否查到该用户   没有返回失败
        if (em == null) {
            return R.error("登录失败");
        }
        //比对密码   没有返回失败
        if (!em.getPassword().equals(password)) {
            return R.error("登录失败");
        }
        //查看员工状态，如果为已禁用状态，则返回员工已禁用结果
        if (em.getStatus() == 0) {
            return R.error("账号已禁用");
        }
        //6、登录成功，将员工id存入Session并返回登录成功结果
        request.getSession().setAttribute("em", em.getId());
        return R.success(em);
    }

    /**
     * 员工退出登陆
     *
     * @param session
     * @return
     */
    @PostMapping("/logout")
    public R<String> lgout(HttpSession session) {
        //将session销毁
        session.invalidate();
        return R.success("退出成功");
    }

    @GetMapping("/page")
    public R<Page> page(int page, int pageSize, String name) {
//构造分页构造器
        Page pageInfo = new Page(page, pageSize);

        //构造条件构造器
        LambdaQueryWrapper<Employee> wrapper = new LambdaQueryWrapper<>();
//设置模糊查询的条件
        wrapper.like(StringUtils.isNotBlank(name), Employee::getName, name);
        //设置排序
        wrapper.orderByDesc(Employee::getUpdateTime);
        //执行查询
        employeeService.page(pageInfo, wrapper);

        return R.success(pageInfo);
    }


    /**
     * 新增员工
     *
     * @param session
     * @param employee
     * @return
     */
    @PostMapping
    public R<String> add(HttpSession session, @RequestBody Employee employee) {

        log.info("新增员工信息{}", employee);
        //给员工设置初始密码并进行md5加密
        employee.setPassword(DigestUtils.md5DigestAsHex(INIT_PWD.getBytes()));

        //设置添加员工的新增时间  更新时间   创建人  更新人
        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());
        long emId = (long) session.getAttribute("em");

        employee.setCreateUser(emId);
        employee.setUpdateUser(emId);
        //执行添加操作
        employeeService.save(employee);

        return R.success("新增成功");
    }


    /**
     * 员工信息修改
     *
     * @param session
     * @param employee
     * @return
     */
    @PutMapping
    public R<String> update(HttpSession session, @RequestBody Employee employee) {

        log.info(employee.toString());
        Long emId = (Long) session.getAttribute("em");
//设置更新日期和更新人
        employee.setUpdateUser(emId);
        employee.setUpdateTime(LocalDateTime.now());
        //执行操作
        employeeService.updateById(employee);
        return R.success("修改员工信息成功");
    }


    /**
     * 修改前的查找员工信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public R<Employee> selectById(@PathVariable Long id) {
        log.info("id:{}", id);
        Employee em = employeeService.getById(id);
        if (em != null) {
            return R.success(em);
        }
        return R.error("没有查询到该员工信息");
    }

}

