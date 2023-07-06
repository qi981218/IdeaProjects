package com.cyq.test;

import com.cyq.company.Manager;
import com.cyq.company.Programmer;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 18:54
 */
public class CompanyTest {
    public static void main(String[] args) {
        Manager manager = new Manager("张三", 0001, 15000, 5000);
        manager.work();
        Programmer programmer = new Programmer("李四", 200001, 5000);
        programmer.work();
    }
}
