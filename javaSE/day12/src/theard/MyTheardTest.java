package theard;

/**
 * @author 陈亚琪
 * @date 2022年07月22日 14:34
 * @version: 1.0
 */
public class MyTheardTest {
    public static void main(String[] args) {
        MyTheard theard = new MyTheard("线程一");
        MyTheard theard1 = new MyTheard("线程二");
        //给线程添加名字
//        theard.setName("线程一");
//        theard1.setName("线程二");
        
        theard.start();
        theard1.start();
    }
}
