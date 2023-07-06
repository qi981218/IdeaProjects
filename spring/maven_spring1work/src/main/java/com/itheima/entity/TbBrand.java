package com.itheima.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbBrand {
    private Integer id;
    private String brandName;
    private String companyName;
    private Integer status;
    private String description;
    private Integer ordered;
}
