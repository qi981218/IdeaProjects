import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 19:45
 * @version: 1.0
 */
public class Demo5Test {
    public static void main(String[] args) {
//        请编写main()方法，按以下要求顺序
//        1. 循环接收控制台录入的字符串. 并把这些字符串存储到TreeSet集合中.
//        2. 当控制台录入quit时,停止录入数据, 并打印集合.
//                要求：
//        1. 集合可以存储重复内容
//        2. 集合中元素的存储顺序和控制台录入的顺序保持一致.打印集合大小
//        注意:  这里隐藏了两个条件
//        1. 可以存储重复元素, 所以肯定不能使用String的自动排序功能,
//          2. 保持和输入的顺序一致, 则意味着新添加的元素应该放在集合的后边, 即排序时返回值应该>0
//开启键盘录入
        TreeSet<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 1;
            }
        });
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入字符串(输入quit停止录入):");
            String next = sc.next();
            if (!next.equals("quit")) {
                set.add(next);
            } else {
                break;
            }
        }
        System.out.println("数组长度为：" + set.size());
        for (String s : set) {
            System.out.println(s);
        }
    }
}
