package ddm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author 陈亚琪
 * @date 2022年08月03日 14:22
 * @version: 1.0
 */
public class UpdateMydb {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("com.mysql.jdbc.Driver");//可以省略
        //加载驱动
        //如果是本机  端口号是3306 可以写成jdbc:mysql:///mydb
        String url = "jdbc:mysql://127.0.0.1:3306/mydb?useSSL=false&useServerPrepStmts=true";
        String user = "root";//账号
        String pwd = "1234";//密码
        Connection conn = DriverManager.getConnection(url, user, pwd);

        //定义sql语句
        String sql = "update stu set math=77 where id=1";
        //获取执行sql的对象PreparedStatement
        PreparedStatement ps = conn.prepareStatement(sql);
        //执行sql语句
        conn.setAutoCommit(false);//开启事务  useServerPrepStmts=true
        try {
            int i = ps.executeUpdate();
            //提交事物
            conn.commit();
            //处理结果
            System.out.println(i);
        } catch (Exception throwables) {
            conn.rollback();//回滚事务
            throwables.printStackTrace();
        }
        //释放资源
        ps.close();
        conn.close();


    }
}
