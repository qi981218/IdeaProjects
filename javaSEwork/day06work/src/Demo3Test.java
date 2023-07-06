import java.util.HashSet;
import java.util.Iterator;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 19:01
 * @version: 1.0
 */
public class Demo3Test {
    public static void main(String[] args) {
//        请编写main()方法，按以下要求顺序
//        Ø 定义一个Set集合，并存储以下数据：
        HashSet<String> hst = new HashSet<>();
//        刘备，关羽，张飞，刘备，张飞
        hst.add("刘备");
        hst.add("关羽");
        hst.add("张飞");
        hst.add("刘备");
        hst.add("张飞");
//        Ø 打印集合大小
        System.out.println("集合的大小为："+hst.size());
//        Ø 使用迭代器遍历集合，并打印每个元素
        Iterator<String> it = hst.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        Ø 使用增强for遍历集合，并打印每个元素
        System.out.println("--------------");
        for (String s : hst) {
            System.out.println(s);
        }

    }
}
