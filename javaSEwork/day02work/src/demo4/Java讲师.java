package demo4;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:27
 */
public class Java讲师 extends Employee {
    public Java讲师() {
    }

    public Java讲师(String name, char sex, int age) {
        super(name, sex, age);
    }

    @Override
    public void work() {
        System.out.println("讲java");
    }
}
