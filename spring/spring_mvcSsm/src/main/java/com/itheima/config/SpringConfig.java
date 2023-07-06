package com.itheima.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@Configuration
//excludeFilters自定义过滤器
@ComponentScan(value = "com.itheima", excludeFilters = @ComponentScan.Filter(RestController.class))
@PropertySource("classpath:jdbc.properties")//处理和properties关联的问题
@Import({JDBCConfig.class, MyBatisConfig.class})
@EnableAspectJAutoProxy//开启AOP功能
@EnableTransactionManagement//开启事物管理
public class SpringConfig {
}
