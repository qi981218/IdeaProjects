package stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 18:18
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
//        定义main()方法，按以下顺序编写程序：
//        1. 定义集合List<String>，添加以下数据：
//           “周伯通”
//           “张三丰”
//           “周芷若”
//           “张无忌”
//           “赵敏”
//           “张松溪
//           “周颠”
        List<String> list = new ArrayList<>();
        list.add("周伯通");
        list.add("张三丰");
        list.add("周芷若");
        list.add("张无忌");
        list.add("赵敏");
        list.add("张松溪");
        list.add("周颠");
//        2. 使用Stream流, 获取所有的“张”姓学员中的前两个学员,并打印；
        list.stream().filter(name -> name.startsWith("张")).limit(2).forEach(name -> System.out.println(name));
//        3. 使用Stream流, 获取所有的“周”姓学员中除了第一个之外的其他学员, 并打印
        System.out.println("=======================");
        list.stream().filter(name -> name.startsWith("周")).skip(1).forEach(name -> System.out.println(name));

    }
}
