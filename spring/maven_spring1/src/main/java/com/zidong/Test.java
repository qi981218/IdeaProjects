package com.zidong;

import com.spring.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Aa bean = applicationContext.getBean(Aa.class);
        DataSource bean = applicationContext.getBean(DataSource.class);
        System.out.println(bean);
    }
}
