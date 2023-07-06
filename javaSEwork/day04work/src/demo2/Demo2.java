package demo2;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
//        1. 对数组进行升序排列；
//        2. 排序后，使用二分法查找2, 并打印查询结果；
//        3. 再使用二分法查找200，并打印查找结果；
        int[] arr = {431, 54, 25, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7, 54};
        Arrays.sort(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int input = sc.nextInt();
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (input > arr[mid]) {
                //input>arr[mid]   arr[mid]右边的全部不要   min=mid+1
                min = mid + 1;
            } else if (input < arr[mid]) {
                //input>arr[mid]   arr[mid]左边的全部不要   max=max-1
                max = max - 1;
            } else if (input == arr[mid]) {
                System.out.println(mid);
                return;
            }
        }
        System.out.println(input + "不在数组里");


    }
}
