package demo2;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:02
 */
public class Coach extends Person {
    public Coach() {
    }

    public Coach(int id, String name, char gender, int age) {
        super(id, name, gender, age);
    }

    @Override
    public void eat() {
//吃工作餐
        System.out.println("吃工作餐");
    }
}
