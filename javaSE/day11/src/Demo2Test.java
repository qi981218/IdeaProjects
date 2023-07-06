import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 21日 14:41
 * @version: 1.0
 */
public class Demo2Test {
    public static void main(String[] args) throws IOException {
        //创建集合保存读取的数据
        ArrayList<Integer> list = new ArrayList<>();
        //创建字符缓冲输入流读取数据
        BufferedReader br = new BufferedReader(new FileReader("day11//a.txt"));
        String s;
        //读取数据

        while ((s = br.readLine()) != null) {
            //每次读取都存入集合
            list.add(Integer.parseInt(s.trim()));
        }
        //关闭资源
        br.close();
        //集合排序
        Collections.sort(list);
        //翻转
        Collections.reverse(list);
        //写入数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11//a.txt"));
        //遍历集合并写入
        for (int s1 : list) {
            bw.write(s1 + "");
            bw.newLine();
        }
        bw.flush();
        bw.close();


    }
}
