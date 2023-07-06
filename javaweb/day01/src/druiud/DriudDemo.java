package druiud;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import day01.src.entity.Tb_User;
import util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年08月03日 18:12
 * @version: 1.0
 */
public class DriudDemo {

//    //使用数据库连接池
//    static DataSource dataSource = null;
//
//    static {
//        //加载properties配置文件
//        Properties pro = new Properties();
//        try {
//            pro.load(new FileInputStream("D://IdeaProjects//javaweb//day01//src//druid.properties"));
//            //获取连接池对象
//            dataSource = DruidDataSourceFactory.createDataSource(pro);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) throws SQLException {
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        //获取数据库连接connection
        Connection conn = Dbutil.getConn();
        String sql = "select * from tb_user where id=?";
        System.out.println("请输入要查找的id:");
        int id = sc.nextInt();
        //获取PreparedStatement对象
        PreparedStatement ps = conn.prepareStatement(sql);
        //注入参数
        ps.setInt(1, id);
        //返回结果集
        ResultSet rs = ps.executeQuery();

        Tb_User tb_user = null;

        if (rs.next()) {
            tb_user = new Tb_User(rs.getInt(1), rs.getString(2), rs.getString(3));
        }
        System.out.println(tb_user);
        Dbutil.getClose();

    }
}
