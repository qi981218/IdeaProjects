package runnable;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 20:35
 * @version: 1.0
 */
public class Colock {
    public static void main(String[] args) {
        //创建线程池
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.submit((Runnable) () -> {
            while(true){
                synchronized (Colock.class) {
                    //获取当前时间
                    Date date = new Date();
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String format1 = format.format(date);
                    System.out.println(format1);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}
