package com.cyq.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 陈亚琪
 * @date 2022年08月12日 15:46
 * @version: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TbBrand {

    private Integer id;
    // 品牌名称
    private String brandName;
    // 企业名称
    private String companyName;
    // 排序字段
    private Integer ordered;
    // 描述信息
    private String description;
    // 状态：0：禁用  1：启用
    private Integer status;
}
