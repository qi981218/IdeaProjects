package demo1;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        //1. 定义以下数组：
        int[] arr = {1, 2, 432, 32, 54, 32, 3, 7, 657, 563, 25, 43, 6, 463, 52};
//        2. 把数组转换为字符串, 要求格式为”[1, 2, 3]”形式, 并打印到控制台
        System.out.println(Arrays.toString(arr));
//        3. 对数组进行进行升序排列；
        Arrays.sort(arr);
//        4. 把升序排列后的数组, 转换为字符串,并打印到控制台
        System.out.println(Arrays.toString(arr));


    }
}
