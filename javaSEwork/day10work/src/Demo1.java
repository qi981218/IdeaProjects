import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 16:20
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
//        项目根目录下有一个文本文件 “学生名单.txt” ,文件内容如下.
//                张曼玉
//                林青霞
//                刘德华
//                张学友
//        要求: 读取其中数据, 并打印到控制台
        //创建字符输入流
        BufferedReader fr = new BufferedReader(new FileReader("day10work//学生名单.txt"));
        //读取数据
        String line;
        while ((line = fr.readLine()) != null) {
            System.out.println(line.trim());
        }
        fr.close();

    }
}
