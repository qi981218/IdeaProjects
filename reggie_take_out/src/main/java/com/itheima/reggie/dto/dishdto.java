package com.itheima.reggie.dto;

import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;

public class dishdto extends Dish {
    //菜品口味集合
    private List<DishFlavor> flavors = new ArrayList<>();
    //    菜品及套餐分类名称
    private String categoryName;

    private String copies;


}
