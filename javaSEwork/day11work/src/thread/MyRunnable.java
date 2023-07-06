package thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 18:16
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    private int picks = 100;//定义票数
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (picks > 0) {
                    Thread.sleep(100);
                    picks--;
                    System.out.println(Thread.currentThread().getName() + "卖出了一张票，还剩" + picks + "张票");
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }
    }
}
