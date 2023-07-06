package properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 20:24
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建properties对象
        Properties pro = new Properties();
        //创建输入流
        FileReader fr = new FileReader("day11work//config.properties");
        pro.load(fr);
        fr.close();
        System.out.println(pro);
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入账号:");
        String userName = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();
        if (userName.equals(pro.get("username")) && pwd.equals(pro.get("password"))) {
            System.out.println("登录成功！");
        } else {
            System.out.println("登陆失败!");
        }
    }
}
