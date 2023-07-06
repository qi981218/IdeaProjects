import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 18:00
 * @version: 1.0
 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        //使用GBK编码, 读取“test.txt”文件的内容，并打印. “我的目标是: … …”
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day10work//test.txt"), "gbk");
       int i;
        System.out.println("我的目标是: … …");
        while ((i=isr.read())!=-1){
            System.out.println((char) i);
        }
        isr.close();
    }
}
