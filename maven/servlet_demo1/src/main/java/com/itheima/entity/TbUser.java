package com.itheima.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 陈亚琪
 * @date 2022年08月11日 18:14
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbUser {
    private Integer id;
    private String username;
    private String password;
}
