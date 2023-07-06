package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 18:24
 * @version: 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
//        定义main()方法，按以下顺序编写程序：
//        1. 定义集合List<String>，添加以下数据：
//            “宋远桥”
//           “张翠山”
//           “周芷若”
//           “张无忌”
//           “赵敏”
//           “张松溪
//           “宋青书”
        List<String> list = new ArrayList<>();
        list.add("宋远桥");
        list.add("张翠山");
        list.add("周芷若");
        list.add("张无忌");
        list.add("赵敏");
        list.add("张松溪");
        list.add("宋青书");
//        2. 使用Stream流, 获取所有的“张”姓学员和“宋”姓学员, 并把获取到的信息存储到新集合中. 然后遍历集合并打印
        Stream<String> stream = list.stream().filter(name -> name.startsWith("张"));
        Stream<String> stream1 = list.stream().filter(name -> name.startsWith("宋"));
        Stream.concat(stream,stream1).forEach(name-> System.out.println(name));

    }
}
