package com.cyq.dao;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 15:44
 */
public class WoodDoor extends Door {
    public WoodDoor(double weight, double height, String name) {
        super(weight, height, name);
    }

    public WoodDoor() {
    }

    @Override
    public void kai() {
        System.out.println("手动开门");
    }

    @Override
    public void guan() {
        System.out.println("手动关门");

    }
}
