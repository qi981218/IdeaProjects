package com.itheima.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration//标注配置类
@ComponentScan("com.itheima")//扫描包
@PropertySource("classpath:jdbc.properties")//关联properties
@Import({JdbcConfig.class,MybatisConfig.class})//管理第三方bean
public class SpringConfig {
}
