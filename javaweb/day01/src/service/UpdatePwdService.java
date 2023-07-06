package day01.src.service;

import day01.src.dao.Tb_UserDao;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年08月03日 19:15
 * @version: 1.0
 */
public class UpdatePwdService {
    public static void main(String[] args) throws SQLException {
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改密码的id:");
        int id = sc.nextInt();
        System.out.println("请输入修改后的密码:");
      String pwd = sc.next();
      String result= Tb_UserDao.updatePwd(id,pwd);
        System.out.println(result);
    }
}
