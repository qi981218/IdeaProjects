package com.cyq.company;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 18:52
 */
public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("姓名是" + name + ",工号是" + id + ",工资是" + salary + "的程序员,钱多,活少,离家近");
    }
}
