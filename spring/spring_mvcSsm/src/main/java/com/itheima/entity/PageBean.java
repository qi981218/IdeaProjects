package com.itheima.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PageBean {
    private List<TbBrand> tbBrand;
    private Integer total;//信息总条数
}
