package demo3;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:11
 */
public abstract class Person {
    //    属性：姓名name、年龄age、
    public String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    方法：吃饭eat、睡觉sleep，工作work。
    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

    public abstract void work();
}
