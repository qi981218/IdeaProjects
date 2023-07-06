import java.util.HashSet;
import java.util.List;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 18:47
 * @version: 1.0
 */
public class Demo2Test {
    public static void main(String[] args) {
//        产生10个1-100的随机数，并放到一个集合中.
//        1. 集合中的数字不能重复.
//        2. 集合中总共存储10个数据.
//        3. 遍历集合,并把所有数据打印到控制台。
        HashSet<Integer> list = new HashSet<>();//声明一个list数组
        while (list.size() < 10) {
            int i = (int) (Math.random() * 100 + 1);//声明一个1-100之间的随机数
            list.add(i);
            System.out.println(i);
        }
        for (Integer it : list) {
            System.out.println(it);
        }

    }

}

