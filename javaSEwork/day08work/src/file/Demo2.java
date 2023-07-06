package file;

import java.io.File;
import java.io.IOException;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 19:21
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
       // 请编写main()方法，创建以下File对象：
        File file1 = new File("test.txt");      //相对路径，在项目根目录下
//        要求：
//        1. 判断file1是否存在？如果不存在，创建这个文件。
        if (!file1.exists()){
            file1.createNewFile();
        }
//        2. 判断file2是否存在？如果不存在，创建这个目录。
        File file2 = new File("abc");
        if(!file2.isDirectory()){
            file2.mkdir();
        }
//        3. 判断file3是否存在？如果不存在，创建这个多级目录。
        File file3 = new File("aaa/bbb/bbb");
        if(!file3.isDirectory()){
            file3.mkdirs();
        }

    }
}
