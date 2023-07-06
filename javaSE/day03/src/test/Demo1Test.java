package test;

import demo1.Demo1;

/**
 * @Author 陈亚琪
 * @Date 2022/7/10 9:11
 */
public class Demo1Test {
    public static void main(String[] args) {
//        //创建内部类对象
//        //格式：外部类名.内部类名  对象名=外部类对象.内部类对象
//        Demo1.De de = new Demo1().new De();
//        de.show();//调用内部类方法

        //创建外部类对象    通过外部类方法间接调用内部类方法
        Demo1 d1 = new Demo1();
        d1.method();


    }
}
