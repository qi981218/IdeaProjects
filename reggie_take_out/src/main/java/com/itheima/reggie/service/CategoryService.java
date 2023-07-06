package com.itheima.reggie.service;

import com.itheima.reggie.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 菜品及套餐分类 服务类
 * </p>
 *
 * @author 陈亚琪
 * @since 2022-09-03
 */
public interface CategoryService extends IService<Category> {
    //根据ID删除分类
    public void remove(Long id);
}
