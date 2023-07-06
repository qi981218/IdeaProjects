package day01.src.service;

import day01.src.dao.Tb_UserDao;
import day01.src.entity.Tb_User;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年08月03日 19:09
 * @version: 1.0
 */
public class SelectByIdService {
    public static void main(String[] args) throws SQLException {
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的id:");
        int id = sc.nextInt();
       Tb_User tb_user= Tb_UserDao.selectId(id);
        System.out.println(tb_user);
    }
}
