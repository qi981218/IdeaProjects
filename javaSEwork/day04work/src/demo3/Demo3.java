package demo3;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
//        已知有个字符串"93,65,72,84,53",要求,对这些数据进行排序.
//
//                打印结果: [53,65,72,84,93]

        String s="93,65,72,84,53";
        String[]s1=s.split(",");
        int[]ints=new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
             ints[i]= Integer.parseInt(s1[i]);

        }
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

    }
}
