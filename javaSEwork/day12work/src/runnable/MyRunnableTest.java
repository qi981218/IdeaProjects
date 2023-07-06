package runnable;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 19:04
 * @version: 1.0
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
        //实例化Thread对象
        Thread th1 = new Thread(my,"窗口一");
        Thread th2 = new Thread(my,"窗口二");
        Thread th3 = new Thread(my,"窗口三");
        th1.start();
        th2.start();
        th3.start();
/*
出现了一张票被多次卖出的现象
原因：当一个线程在对数据进行操作时；另一个线程也对其进行了操作
 */

    }
}
