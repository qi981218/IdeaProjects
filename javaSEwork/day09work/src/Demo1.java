import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 18:13
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //请使用字节流复制一个文件，一次读、写一个字节。
        //创建输入流读取文件
        FileInputStream fis = new FileInputStream("D://Desktop//aa.txt");
        //创建输出流写文件
        FileOutputStream fos = new FileOutputStream("D://Desktop//aa1.txt");
        //进行 读写操作
        int d;
        while((d=fis.read())!=-1){
            fos.write(d);
        }
        fis.close();
        fos.close();

    }
}
