package com.cyq.dao;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 14:51
 */
public class DoorDemo {

    public static void main(String[] args) {
        WoodDoor d = new WoodDoor(150, 200, "新虎家具");
        System.out.println(d.getName() + "  " + d.getHeight() + " " + d.getWeight());
        d.guan();
        d.kai();

        ElectricAlarmDoor e=new ElectricAlarmDoor(100, 200, "新虎家具");
        System.out.println(e.getName() + "  " + e.getHeight() + " " + e.getWeight());
        e.electric();
        e.guan();
        e.kai();
    }
}
