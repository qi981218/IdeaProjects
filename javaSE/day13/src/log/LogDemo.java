package log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

/**
 * @author 陈亚琪
 * @date 2022年07月27日 15:28
 * @version: 1.0
 */
public class LogDemo {
    private static final Logger LOGGER = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入名字:");
        String name = sc.next();
        try {
            System.out.println("请输入年龄:");
            String age1 = sc.next();

            int age = Integer.parseInt(age1);
            LOGGER.info("年龄格式正确" + age);
        } catch (Exception e) {
            LOGGER.info("年龄格式错误");
        }

    }
}
