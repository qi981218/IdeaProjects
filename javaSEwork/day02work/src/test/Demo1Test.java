package test;

import demo1.Animal;
import demo1.Cat;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 17:53
 */
public class Demo1Test {
    public static void main(String[] args) {
        //使用多态实例化动物类
        Animal a = new Cat("小白", 5, '女');
        System.out.println(a.getName() + " " + a.getSex() + " " + a.getAge());
        a.eat();
        Cat c = (Cat) a;
        c.catchMouse();

    }
}
