package com.demo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class TestInvokeDirect {
    public static void main(String[] args) {
        int[] arr = {10, 27, 8, 5, 2, 1, 3, 55, 88};
        System.arraycopy(arr, 2, new int[5], 0, 5);
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }


        double[] arr1 = {0.1, 0.2, 2.1, 3.2, 5.56, 7.21};
        BigDecimal sum = new BigDecimal("0.0");//初始化为0   用来保存和
        BigDecimal count = new BigDecimal(arr1.length);//保存数组长度
        //System.out.println(count);
        for (int i = 0; i < arr1.length; i++) {
            BigDecimal bd = new BigDecimal(arr1[i] + "");
            sum = sum.add(bd);//累加
        }
//        MathContext mc=new MathContext(4);
//            BigDecimal sum1 = sum.round(mc);
        System.out.println(sum);
        BigDecimal sum1 = sum.round(new MathContext(4));//设置sum的精度为4，即sum有四个数字
        BigDecimal avg = sum.divide(count, 2, BigDecimal.ROUND_HALF_UP);//平均值(四舍五入保留小数点后2位)
        System.out.println(sum1);
        System.out.println(sum.setScale(2, RoundingMode.HALF_UP));
        System.out.println(avg);
    }
}