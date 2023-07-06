package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 18:07
 * @version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
//        定义main()方法，按以下顺序编写程序：
//        1. 定义集合List<String>，添加以下数据：
//           “张三丰”
//           “郭襄”
//           “张启灵”
//           “周芷若”
//           “张靓颖”
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("郭襄");
        list.add("张启灵");
        list.add("周芷若");
        list.add("张靓颖");
//        2. 使用Stream流, 打印集合的所有元素
        list.stream().forEach(name -> System.out.println(name));
        System.out.println("===============================================");
//        3. 使用Stream流, 获取所有的“张”姓学员, 并使用打印筛选后的结果
        list.stream().filter(name -> name.startsWith("张")).forEach(name -> System.out.println(name));
        System.out.println("===============================================");
//        4. 使用Stream流, 获取所有的“张”姓学员, 并获取获取筛选的数量。
        long count = list.stream().filter(name -> name.startsWith("张")).count();
        System.out.println(count);

    }
}
