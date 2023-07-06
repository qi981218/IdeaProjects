package com.itheima.reggie.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Category;
import com.itheima.reggie.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 菜品及套餐分类 前端控制器
 * </p>
 *
 * @author 陈亚琪
 * @since 2022-09-03
 */
@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 新增分类
     *
     * @param category
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.save(category);
        return R.success("新增分类成功");
    }

    /**
     * 分页查询
     *
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize) {
        //分页构造器
        Page<Category> paheInfo = new Page<>(page, pageSize);
        categoryService.page(paheInfo, Wrappers.<Category>lambdaQuery()//=new LambdaQueryWrapper<>();
                .orderByAsc(Category::getSort));
        return R.success(paheInfo);

    }

    /**
     * 根据id删除菜品
     *
     * @param id
     * @return
     */
    @DeleteMapping
    public R<String> deleteById(Long id) {
        log.info("id：{}", id);
        categoryService.remove(id);
        return R.success("分类信息删除成功");
    }

    /**
     * 根据id修改分类信息
     *
     * @param category
     * @return
     */
    @PutMapping
    public R<String> update(@RequestBody Category category) {
        log.info(category.toString());
        categoryService.updateById(category);
        return R.success("修改分类信息成功");
    }

    /**
     * 根据条件查询菜品分类
     *
     * @param category
     * @return
     */
    @GetMapping("/list")
    public R<List<Category>> getCategoryList(Category category) {
        //构造条件构造器
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper();
        //添加条件
        queryWrapper.eq(category.getType() != null, Category::getType, category.getType());
        //添加排序条件(对查询的结果按照sort排序字段进行升序排序，如果sort相同，再按照修改时间倒序排序。)
        queryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);


        List<Category> categories = categoryService.list(queryWrapper);
        return R.success(categories);
    }

}

