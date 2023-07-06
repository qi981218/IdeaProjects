import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/27 19:16
 */
public class Demo5 {
    //    5 定义一个方法，查找指定数字在数组中出现的索引(若出现多次，多次打印)
//    如: 数组{1,2,3,2} 要查找的数是2 则方法内部会打印索引值 1   3
//    数组{1,2,3,2} 要查找的数是5 则方法每部会打印 "数组中没有这个数字"
    public static void count(int a, int[] arr) {
        int count = 0;//统计指定数字出现的次数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                System.out.println(i+" ");
                count++;
            }
        }
        if(count==0){
            System.out.println("数组中没有这个数字");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度：");
        while (true) {
            int length = sc.nextInt();
            if (length > 0) {
                int[] arr = new int[length];
                for (int i = 0; i < arr.length; i++) {
                    System.out.println("请输入第" + (i + 1) + "个字");
                    arr[i] = sc.nextInt();
                }
                System.out.println("请输入需要查找的数字:");
                int num = sc.nextInt();
               count(num, arr);
                break;
            } else {
                System.out.println("数组的长度必须大于0，请重新输入");
            }
        }

    }
}
