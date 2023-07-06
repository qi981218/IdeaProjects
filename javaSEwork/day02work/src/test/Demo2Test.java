package test;

import demo2.Coach;
import demo2.Person;
import demo2.Player;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:06
 */
public class Demo2Test {
    public static void main(String[] args) {
        //实例化抽象类
        //教练
        Person p = new Coach(1, "张三", '男', 28);
        System.out.println(p.getId() + " " + p.getName() + " " + p.getGender() + " " + p.getAge());
        p.eat();
        System.out.println("---------");
        p = new Player(5, "李四", '男', 18);
        System.out.println(p.getId() + " " + p.getName() + " " + p.getGender() + " " + p.getAge());
        p.eat();
    }
}
