package theard;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 14:32
 * @version: 1.0
 */
public class MyTheard extends Thread {
    public MyTheard() {
    }

    public MyTheard(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("线程一开始干活了！");
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
