import java.util.TreeSet;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 16:36
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>();
        Student s1 = new Student("lisi", 15);
        Student s2= new Student("wangwu", 15);
        Student s3 = new Student("libai", 25);
        Student s4 = new Student("lili", 19);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        System.out.println(students.toString());
    }
}
