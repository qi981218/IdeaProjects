package com.itheima.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;


public class MybatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //设置数据源
        sqlSessionFactoryBean.setDataSource(dataSource);
        //开启驼峰命名
        Configuration config = new Configuration();
        config.setMapUnderscoreToCamelCase(true);
        //将驼峰命名的设置添加进去
        sqlSessionFactoryBean.setConfiguration(config);
        return sqlSessionFactoryBean;
    }


    //扫描mapper映射所在的包
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.itheima.mapper");
        return mapperScannerConfigurer;
    }
}
