import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 16:26
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
//        班级来了几个插班生, 插班生的名字存储在一个List集合中, 详细情况如下
//        List<String> stus = new ArrayList<>();
//        stus.add("刘亦菲");
//        stus.add("赵丽颖");
//        stus.add("段奕宏");
//        stus.add("孙红雷");
//        要求:
//        1. 把集合中的学生, 追加到上述的“学生名单.txt”中
//        2. 每个学生独占一行
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        list.add("刘亦菲");
        list.add("赵丽颖");
        list.add("段奕宏");
        list.add("孙红雷");
       //创建输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10work//学生名单.txt",true));
        //写入数据
        for (String s : list) {
            bw.newLine();
            bw.write(s);
        }
        bw.flush();
        bw.close();

    }
}
