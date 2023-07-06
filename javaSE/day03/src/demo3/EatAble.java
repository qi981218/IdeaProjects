package demo3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/7/11 15:04
 */
public class EatAble {
    public static void main(String[] args) {

        EatAble able = new EatAble();
        //使用匿名内部类调用
        method(
                (name, age) -> System.out.println("我是" + name + "," + age + "岁")
        );
    }

    public static void method(Able a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        a.eat(name, age);
    }

    //创建接口
    interface Able {
        void eat(String name, int age);
    }
}
