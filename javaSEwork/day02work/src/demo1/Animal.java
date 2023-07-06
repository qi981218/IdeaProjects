package demo1;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 17:48
 */
public class Animal {
    //    Ø 属性：名称、年龄、性别
    public String name;
    public int age;
    public char sex;

    public Animal() {
    }

    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    //    Ø 行为：吃饭
    public void eat() {
        System.out.println("吃饭");
    }
}
