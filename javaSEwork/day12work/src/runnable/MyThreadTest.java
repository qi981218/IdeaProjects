package runnable;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 19:43
 * @version: 1.0
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();
        th1.setName("窗口一");
        th2.setName("窗口二");
        th3.setName("窗口三");
        th1.start();
        th2.start();
        th3.start();
    }
}
