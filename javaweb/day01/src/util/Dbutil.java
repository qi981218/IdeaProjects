package day01.src.util;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author 陈亚琪
 * @date 2022年08月03日 18:54
 * @version: 1.0
 */
public class Dbutil {
    //使用数据库连接池
    static DataSource dataSource = null;
    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;

    public static Connection getConn() {
        //加载properties配置文件
        Properties pro = new Properties();
        try {
            pro.load(new FileInputStream("D://IdeaProjects//javaweb//day01//src//druid.properties"));
            //获取连接池对象
            dataSource = DruidDataSourceFactory.createDataSource(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            conn = dataSource.getConnection();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return conn;
    }


    //关闭资源
    public static void getClose() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
