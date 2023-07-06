package demo2;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 17:59
 */
public abstract class Person {
    //编号（id）,姓名(name)、性别(gender)、年龄(age)
    public int id;
    public String name;
    public char gender;
    public int age;

    public Person() {
    }

    public Person(int id, String name, char gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //吃饭（抽象方法）
    public abstract void eat();
}
