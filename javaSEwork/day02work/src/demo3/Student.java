package demo3;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:13
 */
public class Student extends Person {
    //学号stuNumber
    public int stuNumber;

    public Student() {
    }

    public Student(String name, int age, int stuNumber) {
        super(name, age);
        this.stuNumber = stuNumber;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    @Override
    public void work() {
        System.out.println("学生的工作是学习!");
    }
}
