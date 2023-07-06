package com.cyq.bean;

/**
 * @Author 陈亚琪
 * @Date 2022/6/21 20:30
 */
public class Student {
    public int code;//饭卡号
    public String stuName;//学生姓名
    public String stuSex;//学生性别
    public int stuAge;//学生年龄
    public String address;//地址
    public double money;//余额
    public double jia;//充值

    public Student(int code, String stuName, String stuSex, int stuAge, String address, double money, double jia) {
        this.code = code;
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.address = address;
        this.money = money;
        this.jia = jia;
    }

    @Override
    public String toString() {
        return "Student{" +
                "卡号=" + code +
                ", 姓名='" + stuName + '\'' +
                ", 性别='" + stuSex + '\'' +
                ", 年龄=" + stuAge +
                ", 地址='" + address + '\'' +
                ", 余额=" + money +
                "" +
                '}';
    }

    public Student() {
        super();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getJia() {
        return jia;
    }

    public void setJia(double jia) {
        this.jia = jia;
    }
}
