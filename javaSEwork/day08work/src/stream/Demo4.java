package stream;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 18:31
 * @version: 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
//        1.定义一个Person类，包含一个属性：姓名(String)
//        定义无参、全参构造方法
//        定义get/set方法
//        2.定义main()方法，按以下顺序编写程序：
//        3.定义集合List<String>，添加以下数据：
//       “杨过”
//       “小龙女”
//       “乔峰”
//       “阿朱”
//		“令狐冲”
//		“任盈盈”
        List<String> list = new ArrayList<>();
        list.add("杨过");
        list.add("小龙女");
        list.add("乔峰");
        list.add("阿朱");
        list.add("令狐冲");
        list.add("任盈盈");
//        4.使用Stream流的map()方法，将每个元素封装为一个Person对象。
        Stream<Person> personStream = list.stream().map(name -> {
            return new Person(name);
        });
//        5.将新流中的元素提取为List集合。
        List<Person> collect = personStream.collect(Collectors.toList());
//        6.遍历、打印集合中所有的Person对象信息。
        collect.forEach(name -> System.out.println(name));
        //System.out.println(collect);
    }
}
