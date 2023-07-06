package day01.src.dao;


import day01.src.entity.Tb_User;
import day01.src.util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 陈亚琪
 * @date 2022年08月03日 19:07
 * @version: 1.0
 */
public class Tb_UserDao {
    //查询
    public static Tb_User selectId(int id) throws SQLException {
        //获取数据库连接connection
        Connection conn = Dbutil.getConn();
        String sql = "select * from tb_user where id=?";
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
        Dbutil.getClose();
        return tb_user;
    }

    //修改密码
    public static String updatePwd(int id, String pwd) throws SQLException {
        //获取连接
        Connection conn = Dbutil.getConn();
        //sql语句
        String sql = "update tb_user set password=? where id=?";
        //获取
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, pwd);
        ps.setInt(2, id);
        int i = ps.executeUpdate();
        //释放资源
        Dbutil.getClose();
        if (i > 0) {
            return "修改成功!";
        } else {
            return "修改失败!";
        }
    }
}
