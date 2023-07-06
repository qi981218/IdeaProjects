import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 14:39
 * @version: 1.0
 */
public class TestDemo3 {
    public static void main(String[] args) throws Exception {
        //创建输入和输出流对象
            //读取数据
        FileInputStream fis = new FileInputStream("D:\\Desktop\\资料\\黑马\\狄琛林JavaEE就业班\\08.补充视频\\Idea设置maven和jdk.mp4");
            //写入数据
        FileOutputStream fos=new FileOutputStream("Idea设置maven和jdk.mp4");
        int b;
        while((b=fis.read())!=-1){
            fos.write(b);
            System.out.println(b);
        }
        fis.close();
        fos.close();
    }
}
