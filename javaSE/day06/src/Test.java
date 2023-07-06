
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-15  10:32
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        //创建集合保存学生类
        ArrayList<Student> list = new ArrayList<>();
        //添加数据
        Student stu = new Student("张龙龙", 15);
        Student stu1 = new Student("张龙龙1", 18);
        Student stu2 = new Student("张龙龙2", 15);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        //使用迭代器遍历
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            Student next = it.next();
            String name = next.getName();
            if (name.contains("张龙龙1")) {
                list.remove(next);
            } else {
                System.out.println(next);
            }
        }
        System.out.println("----------");
        //使用增强for
        for (Student s : list) {
            String name = s.getName();
            if (name.contains("张龙龙1")) {
                list.remove(s);
            } else {
                System.out.println(s);
            }
        }
        System.out.println("------------");
        for (Student s : list) {
            System.out.println(s);
        }

    }
}
