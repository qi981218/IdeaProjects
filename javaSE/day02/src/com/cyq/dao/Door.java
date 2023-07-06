package com.cyq.dao;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 15:44
 */
public abstract class Door {
    double weight;//宽
    double height;//高
    String name;//品牌

    public Door(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public Door() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void kai();//开门

    public abstract void guan();//关门

}
