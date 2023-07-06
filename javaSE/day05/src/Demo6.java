import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/27 19:29
 */
public class Demo6 {
    //    	1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
//	2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
//	3.在main方法中打印该数字是几位数
    public static String get(long num) {
        int count = 0;
        while (true) {
            if (num == 0) {
                break;
            } else {
                num = num / 10;
                count++;
            }
        }
        return "该数字是" + count + "位数";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        long input = sc.nextLong();
        System.out.println(get(input));
    }
}
