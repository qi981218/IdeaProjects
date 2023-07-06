package demo;

import java.util.Scanner;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  18:12
 * @Version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
//        1. 分别从控制台接收两个整数
//        2. 计算“第一个数 / 第二个数”的结果，并打印；
//        3. 为了防止第二个数为0导致异常，请在计算时使用异常处理。当出现异常时，向用户打印：第二个数不能为0！！
        //开启键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int one = sc.nextInt();
        while (true) {
            try {
                //重新开启控制台
                sc = new Scanner(System.in);
                System.out.println("请输入第二个数：");
                int two = sc.nextInt();
                int i = one / two;
                System.out.println(one+"/"+two+"="+i);
                break;
            } catch (Exception a) {
                System.out.println("第二个数不能为0！！请重新输入");
            }
        }



    }
}
