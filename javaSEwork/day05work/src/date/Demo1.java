package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  19:39
 * @Version: 1.0
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
            //获取当前时间
            Date date = new Date();
            long nowTime = date.getTime();
            //创建日期格式
            SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
            //开启键盘输入
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入生日：");
            String brither = sc.next();
            //转换为date
            Date parse = spd.parse(brither);
            long birtheTime = parse.getTime();
            if (birtheTime<=nowTime){
                long day = (nowTime - birtheTime)/(1000*60*60*24);
                System.out.println(day);
            }else{
                System.out.println("生日必须早于当前日期！");
            }

    }
}
