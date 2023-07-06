package file;

import java.io.File;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 19:31
 * @version: 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
//        键盘录入一个目录路径(文件夹), 打印整个文件夹下的所有文件和文件夹:
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个一个目录路径(文件夹)");
        String next = sc.next();
        File file = new File(next);
        //获取所有文件
        File[] files = file.listFiles();
//        要求：
//        1. 不考虑文件夹内部的文件夹.
        for (File file1 : files) {
           // 2. 如果是文件，打印：【文件】+ 绝对路径
            if (file1.isFile()){
                System.out.println("【文件】"+file1.getName()+"  "+file1.getAbsolutePath());
            }
//        3. 如果是目录，打印：【目录】+ 绝对路径
            if (file1.isDirectory()){
                System.out.println("【目录】"+file1.getName()+" "+file1.getAbsolutePath());
            }
        }

    }
}
