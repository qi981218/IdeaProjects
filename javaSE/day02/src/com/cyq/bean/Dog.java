package com.cyq.bean;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 14:10
 */
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void say() {
        System.out.println(name + "," + age);
    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }
}
