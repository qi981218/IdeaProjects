import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 15日 19:29
 * @version: 1.0
 */
public class Demo4Test {
    public static void main(String[] args) {
        //使用自然排序
        TreeSet<Student> set = new TreeSet<>();
        Student stu1 = new Student("张三", 20);
        Student stu2 = new Student("李四", 21);
        Student stu3 = new Student("张三", 20);
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set);

        //使用比较器排序
        TreeSet<Student> set1 = new TreeSet<>((o1, o2) -> {
            //先按年龄排序
            int result = o1.getAge() - o2.getAge();
            //年龄一样按名字排序
            return o1.getAge() ==o2.getAge() ? o1.getName().compareTo(o2.getName()) : result;
        });
        set1.add(stu1);
        set1.add(stu2);
        set1.add(stu3);
        System.out.println(set1);




    }
}
