package demo4;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:24
 */
public abstract class Employee {
    //    属性：姓名、性别、年龄(全部私有)
//    行为：工作(抽象)
    private String name;
    private char sex;
    private int age;

    public Employee() {
    }

    public Employee(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void work();


}
