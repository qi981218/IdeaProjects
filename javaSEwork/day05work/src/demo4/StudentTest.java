package demo4;

import java.sql.SQLOutput;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  19:14
 * @Version: 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge("55");
        } catch (Exception a) {
            a.printStackTrace();
        }
    }

}
