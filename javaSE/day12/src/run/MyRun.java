package run;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 15:05
 * @version: 1.0
 */
public class MyRun implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
    }
}
