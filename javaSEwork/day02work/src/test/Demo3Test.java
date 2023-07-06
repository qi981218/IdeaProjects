package test;

import demo3.Person;
import demo3.Student;
import demo3.Worker;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:17
 */
public class Demo3Test {
    public static void main(String[] args) {
        Student s=new Student("张三",15,2005);
        s.work();
        System.out.println("------------");
        Worker worker = new Worker();
        worker.work();

    }
}
