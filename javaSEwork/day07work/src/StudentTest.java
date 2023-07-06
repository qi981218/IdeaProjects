import java.util.HashSet;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 16日 18:17
 * @version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
//        假如你有3个室友,请使用HashSet集合保存3个室友的信息(1对象), 信息如下:
//        赵丽颖,18    范冰冰,20    杨幂,19
        HashSet<Student> hashSet = new HashSet<>();
        Student s1 = new Student("赵丽颖", 18);
        Student s2 =new Student("范冰冰",20);
        Student s3 =new Student("杨幂",19);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        System.out.println(hashSet);

    }
}
