package com.cyq.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author 陈亚琪
 */

public class Demo01 {
    public static void main(String[] args) {
//       1. 模仿HelloWorld案例完成
        System.out.println("HelloWord!");
//        2.请编写程序，将某位学员的个人信息输出到屏幕上。信息包括姓名（字符串常量）、性别（字符常量）、年龄（整型常量）、身高（单位米，小数常量）、婚否（布尔常量）。输出格式如下：
////        张三 男 18 1.78 false ~~~
        String name = "张三";
        char sex = '男';
        int age = 18;
        float height = 1.8F;
        boolean wedding = false;
        System.out.print("姓名:" + name + " " + "性别:" + sex + " " + "年龄:" + age + " " + "身高:" + height + "米 " + "婚否:");
        if (wedding) System.out.print("是");
        else System.out.print("否");
//        1、java中的8种基本数据类型都有什么？
//         byte   short   long    char    boolean    int   float  double
//        2、定义变量的格式是什么？
//       数据类型   变量名=初始值；声明变量并赋值
        //数据类型  变量名；
        //变量名=初始值；先声明在赋值
//        3、变量名该怎样定义？
//驼峰命名法   可以包含英文字母、数字字符、英文下划线（_）和英文美元符（$），并且不能以数字开头    变量名首字母小写：如className   类名首字母大写   如：ClassName
        //4、该怎样使用变量？
        // 定义byte类型变量，值为整数，只要在byte范围即可，byte范围：-128 ~ 127
        byte by = 100;
        System.out.println(by);
        // 定义short类型变量，值为整数，只要在short范围即可
        short s = 12345;
        System.out.println(s);

        // 整数的默认类型就是int类型
        int num = 654321;
        System.out.println(num);

        // 定义long类型的整数，需要在数据的后面加字母（L），大小写不限，建议大写。
        long lo = 12L;
        System.out.println(lo);

        // 定义float类型的浮点数，需要在数据的后面加字母（F），大小写不限，建议大写。
        float f = 1.5F;
        System.out.println(f);

        // 浮点型默认类型double
        double d = 123.456;
        System.out.println(d);

        // 布尔型只有两个取值：true和false
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);
        System.out.println(b2);

        // 定义字符型需要一对英文的单引号包裹，并且只能包含一个字符
        char c = 'a';
        System.out.println(c);
//4.请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
//        1、班级里有100个学员。
        int num1 = 100;
        System.out.println(num1);
//        2、某商品价格55.55元。
        double price = 55.55;
        System.out.println(price);
//        3、地球已经诞生超过46亿年。
        long time = 4600000000L;
        System.out.println(time);
//        4、“5是偶数”这句话的描述是假的。
        boolean zhenjia = false;
        if (zhenjia) System.out.println("“5是偶数”这句话的描述是真的");
        System.out.println("“5是偶数”这句话的描述是假的");
        //5.改错   变量的定义和赋值只能在同一个花括号    变量定义在花括号外是全局变量
        // 片段1
        int a = 10;
        {
            a = 20;
            System.out.println(a);
        }//但是这个a变量定义的是全局变量

        // 片段2
        //第一种改法
        int b = 20;
        System.out.println(b);
        b = 30;
        System.out.println(b);
        //第二种改法
        {
            int bb = 20;
            System.out.println(bb);
        }
        int bb = 20;
        bb = 30;
        System.out.println(bb);//这个变量只在花括号内生效  这个是局部变量   所以可以在花括号外定义一个全局变量
        //6        定义两个整数（int类型）变量
        int i1 = 10;
        int i2 = 10;
        int i3 = i1 + i2;
        System.out.println("i1+i2=" + i3);
        //7.饭卡系统
//        我的姓名是：张三
//        我的性别是：男
//        我的年龄是：18
//        我的地址是：xx省xx市
//        我的饭卡余额是：55.55元


//     1.正常终止当前运行的Java虚拟机：System.exit(0)
//       2.异常终止当前运行的Java虚拟机：System.exit(非零的int型参数)
        //一、break和continue的作用
        //  break和continue都是用来控制循环结构的，主要作用是停止循环。
        //
        //二、break和continue的区别
        //1、break用于跳出一个循环体或者完全结束一个循环，不仅可以结束其所在的循环，还可结束其外层循环。
        //
        //注意：
        //（1）只能在循环体内和switch语句体内使用break。
        //（2）不管是哪种循环，一旦在循环体中遇到break，系统将完全结束循环，开始执行循环之后的代码。
        //（3）当break出现在循环体中的switch语句体内时，起作用只是跳出该switch语句体，并不能终止循环体的执行。若想强行终止循环体的执行，可以在循环体中，但并不在switch语句中设置break语句，满足某种条件则跳出本层循环体。
        //
        //2、continue语句的作用是跳过本次循环体中剩下尚未执行的语句，立即进行下一次的循环条件判定，可以理解为只是中止(跳过)本次循环，接着开始下一次循环。
        //
        //注意：
        //（1）continue语句并没有使整个循环终止。
        //（2）continue 只能在循环语句中使用，即只能在 for、while 和 do…while 语句中使用。
        int code = 2000;//饭卡号
        double money = 0;//余额
        int login = 0;//登录标识符   1存在数据   0不存在数据
        List<Student> students = new ArrayList<>();
        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择：0.退出   1.注册    2.登录 ");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else if (input == 1) {
                System.out.println("请输入学生姓名：");
                String stuName = sc.next();//学生姓名
                System.out.println("请输入学生性别:");
                String stuSex = sc.next();//学生性别
                System.out.println("请输入学生年龄:");
                int stuAge = sc.nextInt();//学生年龄
                System.out.println("请输入地址:");
                String address = sc.next();//地址
                System.out.println("请输入充值金额：");
                double jia = sc.nextDouble();//充值
                money = money + jia;//余额=充值+原本余额，初始// 为0
                code++;//卡号自增
                stu = new Student(code, stuName, stuSex, stuAge, address, money, jia);
                students.add(stu);
            } else if (input == 2) {
                System.out.println("请输入卡号：");
                int code1 = sc.nextInt();
                for (Object s1 : students) {
                    Student ss = (Student) s1;
                    System.out.println(ss);
                    if (ss.getCode() == code1) {
                        stu = ss;
                        login = 1;
                    }
                }
                if (login == 1) {
                    System.out.println("登陆成功！");
                    login = 0;//标识符恢复默认
                    while (true) {System.out.println("请选择：1.查询余额   2.充值   3.退出");
                    int xz = sc.nextInt();

                        switch (xz) {
                            case 1:
                                System.out.println(stu.getMoney());
                                break;

                            case 2:
                                System.out.println("请输入充值金额：");
                                double jia = sc.nextDouble();
                                stu.setJia(jia);
                                double m = stu.getMoney() + jia;
                                stu.setMoney(m);
                                break;
                            case 3:
                                System.exit(0);
                        }
                    }
                } else {
                    System.out.println("卡号不存在，请注册！");
                }
            }

        }


    }
}
