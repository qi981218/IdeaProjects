import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 17:55
 * @version: 1.0
 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        //使用GBK编码，向当前模块下的文件”test.txt”, 输出内容：”学好Java，月薪过万！！！”
        //创建输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day10work//test.txt"),"gbk");
        osw.write("学好Java，月薪过万！！！");
        osw.close();

    }
}
