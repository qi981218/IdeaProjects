package cn.itcast.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("cn.itcast.controller")
@EnableWebMvc //开启辅助功能, 其中一个是json的自动转换
public class SpringMVCConfig {
}
