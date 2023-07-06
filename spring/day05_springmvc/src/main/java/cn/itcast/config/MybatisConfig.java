package cn.itcast.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MybatisConfig {
    /**
     * 这是整合mybatis用的, 我们将mybatis的核心类 SqlSessionFactory放入spring的容器中
     * 此时使用SqlSessionFactoryBean来做的原因........
     * ....
     * ...
     * ....
     * @param dataSource
     * @return
     */
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //给SqlSessionFactory配置连接池
        sqlSessionFactoryBean.setDataSource(dataSource);
        Configuration configuration = new Configuration();
        //让SqlSessionFactory开启驼峰命名
        configuration.setMapUnderscoreToCamelCase(true);
        sqlSessionFactoryBean.setConfiguration(configuration);
        return sqlSessionFactoryBean;
    }

    /**
     * 我们可以借助MapperScannerConfigurer告知spring我们的sql语句写在什么位置
     * spring找到这些接口然后采用动态代理的方式创建出了这些接口二级代理对象
     * 二级代理做的事情:
     *      在一级代理的基础上, 提交了事务, 关闭了资源
     * 在我们的ioc容器中, 放的都是二级代理, 我们拿到也是二级代理用的更舒心!!!!
     * @return
     */
    @Bean
    public MapperScannerConfigurer getMapperScannerConfigurer() {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("cn.itcast.mapper");
        return mapperScannerConfigurer;
    }


}
