import java.io.*;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 18:21
 * @version: 1.0
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        //使用字节缓冲流复制电脑上的图片文件
        //创建读取的缓冲流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D://Desktop//21.jpg"));
        //创建写入的缓冲区
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D://Desktop//22.jpg"));
        //进行读写操作
        int a;
        while ((a = bis.read()) != -1) {
            bos.write(a);
        }
        bis.close();
        bos.close();
    }
}
