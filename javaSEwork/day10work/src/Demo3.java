import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 16:36
 * @version: 1.0
 */
public class Demo3 {
    public static void main(String[] args) throws IOException {
/*        现有一个num.txt文件, 内容如下:
        5
        10
        15
        20
        25
        30

        要求:  使用IO流技术, 让文件中的数字, 从小到大排列.(不考虑数字重复的问题)

                效果如下:
        5
        10
        15
        20
        25
        30
        思路提示:
        1. 把文件内容按照”行”读取出来.
        2. 把每行数据转换为数字, 并存储在TreeSet集合中
        3. 然后遍历TreeSet集合, 把数据重新写回num.txt文件*/
        //创建集合用来保存读取的数据
      List<Integer> set =  new ArrayList<>();
        //创建字符输入流读取数据
        BufferedReader br = new BufferedReader(new FileReader("day10work//num.txt"));
        //读取数据
        String line;
        while((line = br.readLine())!=null){
            set.add(Integer.valueOf(line.trim()));
        }
        br.close();
        //给集合排序
        Collections.sort(set);
        //写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10work//num.txt"));
        for (Integer integer : set) {
            bw.write(integer+" ");
            bw.newLine();
        }
        bw.close();

    }
}
