package com.cyq.test;

import com.cyq.school.Student;
import com.cyq.school.Teacher;

/**
 * @Author 陈亚琪
 * @Date 2022/7/8 20:44
 */
public class SchoolTest {
    public static void main(String[] args) {
        Student student = new Student("李四",15);
        student.cat();
        student.study();
        Teacher teacher = new Teacher("李易峰",25);
        teacher.cat();
        teacher.teach();
    }
}
