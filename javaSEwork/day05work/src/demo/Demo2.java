package demo;

import java.util.Scanner;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  18:22
 * @Version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
//        1. 定义一个String[]数组如下：
//        String[] arr = {”星期一”,”星期二”,”星期三”,”星期四”,”星期五”,”星期六”,”星期日”};
//        2. 请用户输入一个整数1--7的值：
//        3. 根据用户输入，从数组中取出对应的星期名称，例如：
//        用户输入：1
//        程序提示：星期一
//        4. 为了防止用户输入小于1或者大于7的值，请使用异常处理从数组中取出对应的“星期名称”，在异常处理中打印：输入错误！！
//开启键盘输入
        //定义一个String[]数组
        String[] arr = {"星期一", "星期二", "星期三", "星期", "星期五", "星期六", "星期日"};
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("请输入一个1-7的整数:");
                int input = sc.nextInt();
                System.out.println(arr[input-1]);
                break;
            } catch (Exception e) {
                System.out.println("输入错误！请重新输入");
            }

        }


    }
}
