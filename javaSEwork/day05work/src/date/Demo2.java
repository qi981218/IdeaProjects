package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  20:07
 * @Version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期(格式：yyyy-MM-dd)");
        String s = sc.next();
        //设置一个日期格式
        SimpleDateFormat spd = new SimpleDateFormat("yyyy-MM-dd");
        Date format = spd.parse(s);
       // System.out.println(format);
        spd = new SimpleDateFormat("yyyy年MM月dd日");
        String format1 = spd.format(format);
        System.out.println(format1);
    }
}
