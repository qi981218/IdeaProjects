import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 19日 14:22
 * @version: 1.0
 */
public class TestDemo2 {
    public static void main(String[] args) throws Exception {
        //创建输出流对象
        FileInputStream inputStream = new FileInputStream("D://Desktop//aa.txt");
        //读取数据
        int b;
        while ((b=inputStream.read()) != -1) {
            System.out.println((char)b);
        }
        inputStream.close();

    }
}
