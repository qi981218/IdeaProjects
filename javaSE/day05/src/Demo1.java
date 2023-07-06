import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/26 18:18
 */
public class Demo1 {
    //    1 定义一个方法 能接受一个整数(这个整数大于3) 打印0到这个整数(包含)之间的所有的偶数
//    如 接受的数字是6则调用完方法打印出来的偶数是 0 2 4 6
//    如 接受的数字是 5则调用完方法打印出来的偶数是 0 2 4
    public static void get(int num) {
        System.out.print("0到" + num + "数之间的所有的偶数:");
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int input = sc.nextInt();
        get(input);
    }
}
