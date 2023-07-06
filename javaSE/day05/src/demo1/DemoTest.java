package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoTest {
    public static void main(String[] args) throws ParseException {
        //开始时间
        String start = "2020-01-01 00:00:00";
        //结束时间
        String end = "2020-01-01 00:10:00";
        //小皮抢购时间
        String xiaoPi = "2020-01-01 00:05:03";
        //小贾抢购时间
        String xiaoJia = "2020-01-01 00:10:03";
        //获取当前系统时间
        Date date = new Date();
        //创建一个日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将String类型的时间转换为date格式并获取其毫秒
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();
        long xiaoPiTime = sdf.parse(xiaoPi).getTime();
        long xiaoJiaTime = sdf.parse(xiaoJia).getTime();
        if (xiaoJiaTime >= startTime && xiaoJiaTime <= endTime) {
            System.out.println("小贾参加了抢购活动");
        } else {
            System.out.println("小贾没有参加抢购活动");
        }
        if (xiaoPiTime >= startTime && xiaoPiTime <= endTime) {
            System.out.println("小皮参加了抢购活动");
        } else {
            System.out.println("小皮没有参加抢购活动");
        }
    }
}
