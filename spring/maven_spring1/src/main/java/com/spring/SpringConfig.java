package com.spring;

import com.zidong.JDBCConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Configuration//标注配置类
@ComponentScan("com.zidong")//扫描自己的相关的bean
@PropertySource("classpath:jdbc.properties")//关联那些properties
@Import(JDBCConfig.class)
public class SpringConfig {
}
