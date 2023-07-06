/**
 * @author 陈亚琪
 * @date 2022年07月29日 18:42
 * @version: 1.0
 */
public class Student {
    private String name;
    private int age;

    @StudentUtil()
    public void a(String name, int age) {
        System.out.println("我叫" + name + ",今年" + age + "岁");
    }
}
