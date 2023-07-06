package file;

import java.io.File;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 19:54
 * @version: 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
//        需求:
//        1. 要求定义一个方法, 该方法, 既能删除文件,也能删除文件夹.
//        2. 测试该方法.
//                提示:
//        需要用到递归
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件路径:");
        String input = sc.next();
        //创建file对象并接收传过来的路径
        File file = new File(input);
        deleteFile(file);


    }

    private static void deleteFile(File file) {
        //判断是否为文件夹
        if (file.isFile()) {
            file.delete();
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            //删除文件夹里所有文件
            if (files != null) {
                for (File file1 : files) {
                    deleteFile(file1);
                }
                file.delete();
            }
        }
    }


}
