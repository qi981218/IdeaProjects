package com.cyq.school;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 20:44
 */
public class Person {
    public String name;//姓名
    public int age;//年龄

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void cat() {
        System.out.println("姓名是" + name + ",年龄是" + age + "在吃饭");
    }

}
