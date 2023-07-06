package com.itheima.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

/**
 * @author 陈亚琪
 * @date 2022年08月06日 9:15
 * @version: 1.0
 */
@Data  //get  set   toString
@NoArgsConstructor  //无参
@AllArgsConstructor  //有参
public class TbBrand {
    // id 主键
    private Integer id;
    // 品牌名称
    private String brand_name;
    // 企业名称
    private String company_name;
    // 排序字段
    private Integer ordered;
    // 描述信息
    private String description;
    // 状态：0：禁用  1：启用
    private Integer status;
    ;
}
