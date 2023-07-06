package com.itheima.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author 陈亚琪
 * @date 2022年08月05日 10:34
 * @version: 1.0
 */
@Getter
@Setter
@ToString
public class TbUser {
    private Integer id;
    private String username;
    private String password;

    public TbUser() {
    }

    public TbUser(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TbUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
