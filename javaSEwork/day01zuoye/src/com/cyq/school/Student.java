package com.cyq.school;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 20:50
 */
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void cat() {
        System.out.println("姓名是" + name + ",年龄是" + age + "的学生在吃饭");
    }

    public void study() {
        System.out.println("姓名是" + name + ",年龄是" + age + "的学生在学习");
    }
}
