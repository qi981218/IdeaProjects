package com.cyq.company;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 18:45
 */
public class Employee {
    // 姓名(name) 工号(id) 工资(salary)
    public String name;
    ;
    public int id;
    public double salary;

    public Employee() {
    }

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work() {
        System.out.println("姓名是" + name + ",工号是" + id + ",工资是" + salary + "钱多,活少,离家近");
    }
}
