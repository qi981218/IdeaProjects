package com.cyq.test;

import com.cyq.bean.Animal;
import com.cyq.bean.Dog;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 10:13
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog("旺财", 15);
        a.eat();
        Dog d = (Dog) a;
        d.say();
    }
}
