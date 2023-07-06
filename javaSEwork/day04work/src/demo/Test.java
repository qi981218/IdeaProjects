package demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //开启键盘录入
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name=sc.next();
        System.out.println("请输入年龄:");
        String a=sc.next();
        int  age= Integer.parseInt(a);
        System.out.println("请输入身高:");
        String l=sc.next();
        double height= Double.parseDouble(l);
        System.out.println("请输入婚否:");
        String b=sc.next();
        boolean boo= Boolean.parseBoolean(b);
        System.out.println("请输入性别:");
        String s=sc.next();
        char sex=s.charAt(0);
        Student student=new Student(name,age,height,boo,sex);
        System.out.println(student);
    }
}
