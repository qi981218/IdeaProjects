package thread;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 18:20
 * @version: 1.0
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        //创建Thread类对象，将“自定义类对象”作为构造方法中的参数
        Thread th = new Thread(runnable, "窗口一");
        Thread th2 = new Thread(runnable, "窗口二");
        Thread th3 = new Thread(runnable, "窗口三");

        th.start();
        th2.start();
        th3.start();
    }
}
