import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/25 15:22
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//      1. 请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：
//数组为：{1,2,3,4,5}
//打印结果：1 2 3 4 5
//        ```
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数");
            arr[i] = sc.nextInt();
        }
//        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {//arr.fori
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //System.out.println(Arrays.toString(arr));
//        ## 题目2（训练）
//       现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
//### 训练提示
//        1、数组的元素是小数，需要定义小数类型数组。
//        2、找最值需要先定义一个参考值，然后依次拿每个值与参考值比较即可。
        double[] a = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = a[0];//用来储存最小值
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("数组中的最小值:" + min);
//## 题目3 (训练）
//  创建一个长度为6的整数数组。请编写代码，随
//  机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
        int[] b = new int[6];
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            //公式：Math.random()*(max-min)+min生成大于等于min小于max的double型随机数；
            b[i] = (int) (Math.random() * 100);//将随机数存入数组
            // System.out.println(b[i]);
            sum += b[i];//将生成的随机数相加
        }
        System.out.println(sum);
//## 题目4(训练)
//        现有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位置开始到最小索引位置，
//        依次表示整数的个位、十位、百位。。。
//        依次类推。请编写程序计算，这个数组所表示的整数值。例如：
//        ```java
//数组：{2, 1, 3, 5, 4}
//表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
//```
        int[] c = {2, 1, 3, 5, 4};
        int he = 0;
        for (int i = 0; i < c.length; i++) {
            he = he * 10 + c[i];
        }
        System.out.println(he);
//        ## 题目5（训练）
//        定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
        int[] student = new int[10];//用来存放学生成绩
        int s = 0;//用来存放学生成绩的和
        for (int i = 0; i < student.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位学生的成绩");
            student[i] = sc.nextInt();
            s += student[i];
        }
        System.out.println("学生的平均成绩为" + s / 10 * 1.0);
//## 题目6（训练）
//        有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
//        要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
//        ```
//请输入一个整数数字：
//50
//生成的新数组是：12 14 23 45 50 66 68 70 77 90
//```
        int[] d = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int[] newD = new int[(d.length + 1)];//新数组
        int index = 0;//标记输入的整数应放的索引
        System.out.println("请输入一个整数数字：");
        int input = sc.nextInt();
        for (int i = 0; i < d.length; i++) {
            if (d[i] <= input) {
                newD[i] = d[i];
                index = i + 1;//后面的位置为插入的新数据的位置
            } else {
                newD[i + 1] = d[i];
            }
        }
        newD[index] = input;
        System.out.print("新数组为：");
        for (int i = 0; i < newD.length; i++) {
            System.out.print(newD[i] + " ");
        }
        System.out.println();
//## 题目7（综合）
//        小李用自己的钱买了十只股票，年末他看了各只股票的收益分别是10.4%,-3%,-6.2%,1.2%,-6.1%,-19%,-3.8%,0.9%,-4.5%,5.5%。
//        请使用数组相关知识编程，帮他统计赚钱的股票和赔钱的股票分别有多少只？打印效果如下：
//        ```
//赚钱的股票一共有：4只
//赔钱的股票一共有：6只
//```
        double[] gu = {10.4, -3, -6.2, 1.2, -6.1, -19, -3.8, 0.9, -4.5, 5.5};
        int count = 0;//赚钱的股票的数量
        int count1 = 0;//赔钱的股票的数量
        for (int i = 0; i < gu.length; i++) {
            if (gu[i] < 0) {
                count1++;
            } else {
                count++;
            }
        }
        System.out.println("赚钱的股票一共有：" + count + "只");
        System.out.println("赔钱的股票一共有：" + count1 + "只");
//## 题目8（综合）
//        定义一个数组其中包含多个数字。用自己的方式最终实现，
//        奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
        int l;//数组长度
        int temp;//交换数据时使用
        int index1 = 0;//计算偶数的数量
        System.out.println("请输入数组长度");
        while (true) {
            l = sc.nextInt();
            if (l > 0) {
                break;
            } else {
                System.out.println("数组长度必须大于零,请重新输入数组长度:");
            }
        }
        int[] z = new int[l];
        for (int i = 0; i < z.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数:");
            z[i] = sc.nextInt();
        }
        //判断奇偶  奇数放在数组的左边，偶数放在数组的右边
        for (int i = 0; i < z.length - 1; i++) {
            for (int j = 0; j < z.length - i - 1; j++) {
                if (z[j] % 2 == 0) {
                    temp = z[j];
                    z[j] = z[j + 1];
                    z[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("新数组为：");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        //计算偶数数量
        for (int i = 0; i < z.length; i++) {
            if (z[i] % 2 == 0) {
                index1++;
            }
        }
        System.out.println("偶数有：" + index1 + "个");
        //冒泡排序
        //1.全是偶数或全是奇数
        if (z.length == index1 || index1 == 0) {
            System.out.println("全是偶数或全是奇数");
            for (int i = 0; i < z.length - 1; i++) {
                for (int j = 0; j < z.length - 1 - i; j++) {
                    if (z[j] > z[j + 1]) {
                        temp = z[j + 1];
                        z[j + 1] = z[j];
                        z[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("奇偶都有");
            //奇数排序
            for (int i = 0; i < z.length - index1 - 1; i++) {
                for (int j = 0; j < z.length - index1 - 1 - i; j++) {
                    if (z[j] > z[j + 1]) {
                        temp = z[j + 1];
                        z[j + 1] = z[j];
                        z[j] = temp;
                    }
                }
            }
            //偶数排序
            for (int i = 0; i < index1 - 1; i++) {
                for (int j = z.length - index1; j < z.length - 1 - i; j++) {
                    if (z[j] > z[j + 1]) {
                        temp = z[j + 1];
                        z[j + 1] = z[j];
                        z[j] = temp;
                    }
                }
            }

        }
        System.out.print("新数组为：");
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }


    }
}
