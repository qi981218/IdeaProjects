package run;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 15:07
 * @version: 1.0
 */
public class MyRunTest {
    public static void main(String[] args) {
        //创建自定义类的对象
        MyRun myRun = new MyRun();
        //创建Thread类的对象，把“自定义类的对象”作为构造方法的参数
        Thread thread = new Thread(myRun);
        //开启线程
        thread.start();
    }
}
