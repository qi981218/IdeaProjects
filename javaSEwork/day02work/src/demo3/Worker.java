package demo3;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:16
 */
public class Worker extends Person {
    //工龄workAge;
    public int workAge;

    public Worker() {
    }

    public Worker(String name, int age, int workAge) {
        super(name, age);
        this.workAge = workAge;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.println("工人的工作是盖房子!");
    }
}
