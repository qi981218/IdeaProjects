package com.company.com.demo01;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 14:24
 */
public class Manager extends Employee {
    private double bonus;//奖金

    public Manager() {
    }

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
@Override
    public void say() {
        super.say();
        System.out.println(bonus);
    }
}
