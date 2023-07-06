package thread;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 16:46
 * @version: 1.0
 */
public class MyThreadTest {
    public static void main(String[] args) {
        //创建自定义类对象
        MyThread th = new MyThread();
        MyThread th2 = new MyThread();
        MyThread th3 = new MyThread();
        th.setName("窗口一");
        th2.setName("窗口二");
        th3.setName("窗口三");
        //创建Thread类对象，将“自定义类对象”作为构造方法中的参数
//        Thread th = new Thread(myThread, );
//        Thread th2 = new Thread(myThread, "窗口二");
//        Thread th3 = new Thread(myThread, "窗口三");
        th.start();
        th2.start();
        th3.start();

    }
}
