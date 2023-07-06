package com.company.com.demo01;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 14:19
 */
public class Employee {
    private int id;//工号
    private String name;//姓名
    private double salary;//薪水

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void say() {
        System.out.print(id + "," + name + "," + salary);
    }
}
