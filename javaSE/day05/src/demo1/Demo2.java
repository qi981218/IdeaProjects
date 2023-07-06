package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
SimpleDateFormat时间类
 */
public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //获取当前系统日期
        Date d = new Date();
        //创建一个日期格式
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //按照格式格式化时间
        String f = s.format(d);
        s.parse(f);//将date转换为String类型
        System.out.println(f);
    }
}
