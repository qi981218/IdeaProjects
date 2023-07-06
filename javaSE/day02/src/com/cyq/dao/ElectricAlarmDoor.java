package com.cyq.dao;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 15:45
 */
public class ElectricAlarmDoor extends Door implements Alarm {
    public ElectricAlarmDoor(double weight, double height, String name) {
        super(weight, height, name);
    }

    public ElectricAlarmDoor() {
    }

    @Override
    public void electric() {
        System.out.println("报警");
    }

    @Override
    public void kai() {
        System.out.println("自动开门");

    }

    @Override
    public void guan() {
        System.out.println("自动关门");

    }
}
