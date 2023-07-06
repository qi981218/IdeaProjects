package runnable;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 19:39
 * @version: 1.0
 */
public class MyThread extends Thread{
    private static int ticks=100;

    @Override
    public void run() {
        while (true){
            synchronized (MyThread.class) {
                if(ticks<0){
                    break;
                }else {
                    System.out.println(currentThread().getName() + "还剩" + ticks + "张票！");
                    ticks--;
                }
            }
        }
    }
}
