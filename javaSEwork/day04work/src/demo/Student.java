package demo;

public class Student {
    //    姓名：String类型
    String name;
    //    年龄：int
    int age;
    //    身高：double
    double height;
    //    婚否：boolean
    boolean boo;
    //    性别：char
    char sex;

    public Student() {
    }

    public Student(String name, int age, double height, boolean boo, char sex) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.boo = boo;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isBoo() {
        return boo;
    }

    public void setBoo(boolean boo) {
        this.boo = boo;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", boo=" + boo +
                ", sex=" + sex +
                '}';
    }
}
