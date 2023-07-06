/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 19:24
 * @version: 1.0
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        //先按年龄排序
        int result = this.age - o.age;
        //年龄一样按名字排序
        return this.age == o.age ? this.name.compareTo(o.name) : result;
    }
}
