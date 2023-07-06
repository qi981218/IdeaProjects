import java.io.FileNotFoundException;
import java.io.FileOutputStream;


/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 11:12
 * @version: 1.0
 */
public class TestDemo1 {
    public static void main(String[] args) throws Exception {
        //创建输出流对象
        FileOutputStream outputStream = new FileOutputStream("d://Desktop//a.txt");
        //写
        outputStream.write(99);
        outputStream.write(100);
        outputStream.write(101);
        byte[]bytes={99,100,101};
        //关闭资源
        outputStream.close();
    }
}
