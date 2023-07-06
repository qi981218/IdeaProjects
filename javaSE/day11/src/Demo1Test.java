import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 11:43
 * @version: 1.0
 */
public class Demo1Test {
    public static void main(String[] args) throws IOException {
        //开启键盘
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String userName = sc.next();
        System.out.println("请输入密码:");
        String pwd = sc.next();
        //创建输出流对象
        FileWriter fw = new FileWriter("day11//a.txt");
        //写入数据
        fw.write(userName);
        //换行
        fw.write("\r\n");
        fw.write(pwd);
        //刷新
        fw.flush();
        //释放资源
        fw.close();

    }
}
