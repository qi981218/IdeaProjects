package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Properties;
import java.util.Set;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 19:27
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建properties对象
        Properties pro = new Properties();
        //创建输入流
        FileReader fr = new FileReader("day11work//info.properties");
        //将info.properties的数据保存在集合中
        pro.load(fr);//调用了load方法后，文件中的键值对数据已经在集合中了
        fr.close();
        pro.setProperty("phone","18198765431");
        System.out.println(pro);
        //创建输出流
        FileWriter fw = new FileWriter("day11work//info.properties");
        pro.store(fw,null);
        fw.close();
    }
}
