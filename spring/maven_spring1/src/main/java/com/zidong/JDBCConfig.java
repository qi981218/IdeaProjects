package com.zidong;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class JDBCConfig {
    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.url}")
    private String url;


    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.driverClassName}")
    private String className;

    @Bean
    public DataSource getDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(className);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

}
