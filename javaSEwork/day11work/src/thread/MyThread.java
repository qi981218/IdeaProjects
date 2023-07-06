package thread;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 16:41
 * @version: 1.0
 */
public class MyThread extends Thread {
    private static int picks = 100;//定义票数

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (picks > 0) {
                    picks--;
                    System.out.println(currentThread().getName() + "卖出了一张票，还剩" + picks + "张票");
                } else {
                    break;
                }
            }

        }
    }
}
