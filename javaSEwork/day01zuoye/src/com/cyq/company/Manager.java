package com.cyq.company;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 18:49
 */
public class Manager extends Employee {
    public double bonus;//奖金(bonus)

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("姓名是" + name + ",工号是" + id + ",奖金是" + bonus + ",工资是" + salary + "的项目经理,钱多,活少,离家近");

    }
}
