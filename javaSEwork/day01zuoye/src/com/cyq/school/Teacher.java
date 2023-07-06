package com.cyq.school;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 20:47
 */
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void cat() {
        System.out.println("姓名是" + name + ",年龄是" + age + "的老师在吃饭");
    }

    public void teach() {
        System.out.println("姓名是" + name + ",年龄是" + age + "的老师在教课");
    }
}
