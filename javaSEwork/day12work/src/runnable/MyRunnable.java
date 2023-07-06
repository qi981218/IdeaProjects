package runnable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 18:57
 * @version: 1.0
 */
public class MyRunnable implements Runnable {
    private int ticks = 100;
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            //1.同步代码块
//            synchronized (MyRunnable.class) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                if (ticks >= 0) {
//                    System.out.println(Thread.currentThread().getName() + "还剩" + ticks + "张票！");
//                    ticks--;
//                } else {
//                    break;
//                }
//            }
//            //2.同步方法
//            boolean b = MySynchronized();
//            if (!b){
//                break;
//            }
            //3.lock锁
            try {
                lock.lock();//加锁
                if (ticks >= 0) {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "还剩" + ticks + "张票！");
                    ticks--;
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();//释放锁
            }
        }
    }

    private synchronized boolean MySynchronized() {

        if (ticks >= 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "还剩" + ticks + "张票！");
            ticks--;
            return true;
        } else {
            return false;
        }
    }
}
