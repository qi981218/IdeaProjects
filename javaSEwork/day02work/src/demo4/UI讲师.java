package demo4;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:28
 */
public class UI讲师 extends Employee implements Drawing {
    public UI讲师() {
    }

    public UI讲师(String name, char sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void drawing() {
        System.out.println("画画");
    }

    @Override
    public void work() {
        System.out.println("讲ui");
    }
}
