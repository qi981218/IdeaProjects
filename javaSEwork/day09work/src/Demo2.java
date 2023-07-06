import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 18:17
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //    请使用字节流复制一个文件，一次读、写一个1024的字节数组。
          //创建输入流
        FileInputStream fis = new FileInputStream("D://Desktop//aa.txt");
          //创建输出流
        FileOutputStream fos = new FileOutputStream("D://Desktop//aa1.txt");
        //创建数组作为缓冲区
        byte[] bytes = new byte[1024];
        //进行读写操作
        int len;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
            System.out.println(len);
        }
        fis.close();
        fos.close();

    }
}
