import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/27 18:27
 */
public class Demo4 {
    //  4 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
//  如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数
    public static String count(int a, int[] arr) {
        int count = 0;//统计指定数字出现的次数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                count++;
            }
        }
        return a + "出现了" + count + "次";
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
                System.out.println(count(num, arr));
                break;
            } else {
                System.out.println("数组的长度必须大于0，请重新输入");
            }
        }

    }
}
