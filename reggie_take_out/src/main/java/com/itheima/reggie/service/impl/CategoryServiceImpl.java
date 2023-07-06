package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.itheima.reggie.common.CustomException;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.entity.Dish;
import com.itheima.reggie.entity.Setmeal;
import com.itheima.reggie.mapper.CategoryMapper;
import com.itheima.reggie.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.service.DishService;
import com.itheima.reggie.service.SetmealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜品及套餐分类 服务实现类
 * </p>
 *
 * @author 陈亚琪
 * @since 2022-09-03
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;


    @Override
    public void remove(Long id) {
//查询当前类是否关联了菜品表(dish表->category_id)
        int count = dishService.count(Wrappers.<Dish>lambdaQuery().eq(Dish::getCategoryId, id));
        if (count > 0) {
            //已经关联菜品，抛出一个业务异常
            throw new CustomException("该分类下有菜品，不能删除");
        }
        //查询当前分类是否关联了套餐(setmeal表->category_id)，如果已经关联，抛出一个业务异常
        int count1 = setmealService.count(Wrappers.<Setmeal>lambdaQuery().eq(Setmeal::getCategoryId, id));
        if (count1 > 0) {
            //已经关联套餐，抛出一个业务异常
            throw new CustomException("该分类下有套餐，不能删除");
        }
        //正常删除分类
        removeById(id);
    }
}
