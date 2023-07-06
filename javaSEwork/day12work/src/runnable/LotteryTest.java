package runnable;

import java.util.ArrayList;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 19:50
 * @version: 1.0
 */
public class LotteryTest {
    public static void main(String[] args) {

        Lottery th1 = new Lottery();
        Lottery th2 = new Lottery();
        Lottery th3 = new Lottery();
        th1.setName("张三");
        th2.setName("李四");
        th3.setName("王五");

        th1.start();
        th2.start();
        th3.start();
    }
}
