package com.itheima;

import com.itheima.config.SpringConfig;
import com.itheima.dao.TbBrandDao;
import com.itheima.entity.TbBrand;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfig.class);
        TbBrandDao bean = applicationContext.getBean(TbBrandDao.class);
        List<TbBrand> all = bean.all();
        System.out.println(all);
    }
}
