package com.company;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 9:45
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student("张三", 18);
        s.say();
        s.show();
        System.out.println("-------------");
        Student s1 = new Student("张三", 18);
        s1.setName("李四");
        s1.setAge(15);
        s1.say();
        s1.show();

        //this：本类

        // super 父类
    }
}
