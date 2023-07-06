import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/22 20:41
 */
public class Test02 {
    public static void main(String[] args) {
        //1 键盘录入一个int类型的数据,使用三元运算符判断这个数是奇数还是偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int input = sc.nextInt();
        System.out.println(input % 2 == 0 ? "偶数" : "奇数");
        //2 键盘录入一个学生成绩(int类型),如果成绩大于等于60输出”及格”,如果成绩小于60输出”不及格”
        System.out.println("请输入成绩：");
        int input1 = sc.nextInt();
        System.out.println(input1 >= 60 ? "及格" : "不及格");
        //3 定义一个int类型的变量,初始化值为123,求这个数的个位,十位,百位分别是多少,输出结果:123的个位是3,十位是2,百位是1
        int num = 123;
        int ge = num % 10;
        int shi = num / 10 % 10;
        int bai = num / 100 % 10;
        // 4 定义int类型的变量a,定义int类型的变量b,使用三元运算符判断如果a大于b返回a与b的和,否则返回a与b的乘积,打印结果
        System.out.println("请输入a的值：");
        int a = sc.nextInt();
        System.out.println("请输入b的值：");
        int b = sc.nextInt();
        System.out.println(a != b ? (a > b ? (a + b) : a * b) : "a不能等于b");
        System.out.println("个位是" + ge + ",十位是" + shi + ",百位是" + bai);
//        二、扩展案例(选做)
//        1.小明左、右手中分别拿两张纸牌（比如：黑桃10和红桃8，数字10和8可通过键盘录入），要求编写代码交换小明手中的牌
        System.out.println("请输入左手的纸牌花色和点数");
        String left = sc.next();
        System.out.println("请输入右手的纸牌花色和点数");
        String right = sc.next();

        String temp = left;
        left = right;
        right = temp;
        System.out.println("左手：" + left + ",右手：" + right);
//        int i=5;
//        System.out.println(i++);
//        System.out.println(i);
//        i=5;
//        System.out.println(++i);
//        2 键盘录入学员张浩的3门课程(Java、SQL、Web)的成绩
//        编写程序实现：
//        (1)Java课程和SQL课程的分数值差
//                (2)3门课程的平均分
        System.out.println("请输入java成绩：");
        String java1 = sc.next();
        double java = Double.parseDouble(java1);
        System.out.println("请输入sql成绩：");
        Float sql = sc.nextFloat();
        System.out.println("web：");
        Float web = sc.nextFloat();
        System.out.println("Java课程和SQL课程的分数值差:" + (java - sql));
        System.out.println("3门课程的平均分:" + (java + sql + web) / 3);
    }
}
