import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 18:08
 * @version: 1.0
 */
public class Demo1Test {
    public static void main(String[] args) {
//        (注意：以下所有功能写在一个main()方法中，但请单独实现)
//        请定义一个List类型的集合，存储以下分数信息：
//        88.5,39.2,77.1,56.8,89,99,59.5
        List<Double> list = new ArrayList<>();
        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);
//        请编程实现以下功能：
//        Ø 使用增强for遍历所有元素，并打印
        for (Double d : list) {
            System.out.println(d);
        }
        System.out.println("----------------------");
//        Ø 使用增强for遍历所有元素，打印不及格的分数；
        for (Double d : list) {
            if (d <= 60) {
                System.out.println(d);
            }
        }
        System.out.println("----------------------");
//        Ø 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。
        int count = 0;//用于保存不及格分数的数量；
        double sum = 0.0;//用于计算不及格分数的和
        for (Double d : list) {
            if (d <= 60) {
                sum += d;//累加
                count++;
            }
        }
        System.out.println("不及格的分数有" + count + "个");
        System.out.println("不及格的分数的平均分：" + sum / count);
//        Ø 使用增强for遍历所有元素，求出最高分，并打印；
        double max = 0;//用于保存最高分
        for (Double d : list) {
            if (d >= max) {
                max = d;
            }
        }
        System.out.println("最高分是：" + max);


    }
}
