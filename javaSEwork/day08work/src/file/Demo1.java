package file;

import java.io.File;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 18:41
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
//        键盘录入一个文件路径, 然后通过代码实现以下需求:
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String next = sc.next();
//        1. 判断录入的路径是否真实存在. 然后打印结果
        File file = new File(next);
//        //System.out.println(file);
        System.out.println(file.exists());
//        2. 判断是否是文件, 如果不是, 提示”输入错误!”并打印结果
        if (!file.isFile()) {
            System.out.println("输入错误！");
        }
//        3. 获取文件绝对路径, 并打印结果
        System.out.println(file.getAbsoluteFile());
//        4. 获取文件的文件名, 并打印结果
        System.out.println(file.getName());
//        5. 获取文件的大小, 并打印结果
        System.out.println(file.length());

    }
}
