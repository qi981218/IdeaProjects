package demo2;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:05
 */
public class Player extends Person {
    public Player() {
    }

    public Player(int id, String name, char gender, int age) {
        super(id, name, gender, age);
    }

    @Override
    public void eat() {
        //吃营养餐
        System.out.println("吃营养餐");
    }
}
