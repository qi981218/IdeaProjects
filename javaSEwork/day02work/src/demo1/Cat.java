package demo1;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 17:51
 */
public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, char sex) {
        super(name, age, sex);
    }

    //    Ø 行为：捉老鼠
    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}
