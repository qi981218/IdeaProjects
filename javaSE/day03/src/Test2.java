import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/24 17:14
 */
public class Test2 {
    public static void main(String[] args) {
//        ## 题目1（综合）
//        模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
//        要求：
//​	键盘录入三个整数,其中前两个整数代表参加运算的数据，第三个整数为要进行的运算
// (1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)，演示效果如下:
//​		请输入第一个整数: 30
//​		请输入第二个整数: 40
//​		请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法): 1
//​		控制台输出:30+40=70
        Scanner sc=new Scanner(System.in);
        int []input=new int[3];
        for (int i = 0; i <3 ; i++) {
            System.out.println("请输入第"+(i+1)+"个整数(第三个整数为要进行的运算：1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)");
            input[i]=sc.nextInt();
        }
        switch (input[2]){
            case 1:
            System.out.println(input[0]+"+"+input[1]+"="+(input[0]+input[1]));
            break;
            case 2:
                System.out.println(input[0]+"-"+input[1]+"="+(input[0]-input[1]));
                break;
            case 3:
                System.out.println(input[0]+"*"+input[1]+"="+(input[0]*input[1]));
                break;
            case 4:
                System.out.println(input[0]+"/"+input[1]+"="+(input[0]/input[1]));
                break;
        }






    }
}
