import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 15:19
 * @version: 1.0
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流读取对象
        FileInputStream fis = new FileInputStream("D:\\Desktop\\资料\\黑马\\狄琛林JavaEE就业班\\08.补充视频\\Idea设置maven和jdk.mp4");
        //创建输出流写入对象
        FileOutputStream fos = new FileOutputStream("Idea设置maven和jdk.mp4");
        //创建字符字符数组(实现一次读取多个字符)
        byte[] bytes = new byte[1024];
        int len;//保存每次读取字符的长度
        while ((len=fis.read(bytes))!=-1) {
            fos.write(bytes,0,len);
            System.out.println(len);
        }
        fis.close();
        fos.close();
    }
}
