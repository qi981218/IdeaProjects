package cn.itcast.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@ComponentScan(value = "cn.itcast", excludeFilters = @ComponentScan.Filter(RestController.class))
//这个扫描程序员自己的写的类用的!!!!!!!
@PropertySource("classpath:jdbc.properties")//处理和properties关联的问题
@Import({JDBCConfig.class, MybatisConfig.class}) //处理第三方bean用的
@EnableAspectJAutoProxy //开启AOP功能!!!!
@EnableTransactionManagement//开启事务管理
public class SpringConfig {

}
