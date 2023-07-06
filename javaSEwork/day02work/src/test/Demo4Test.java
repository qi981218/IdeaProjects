package test;

import demo4.Java讲师;
import demo4.UI讲师;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 18:29
 */
public class Demo4Test {
    public static void main(String[] args) {
        //实例化java讲师类
        Java讲师 j=new Java讲师("李白",'男',25);
        System.out.println(j.getName()+","+j.getSex()+","+j.getAge());
        j.work();
        System.out.println("------------------------");
        //实例化ui讲师类
        UI讲师 u = new UI讲师("王五",'男',33);
        System.out.println(u.getName()+","+u.getSex()+","+u.getAge());
        u.drawing();
        u.work();

    }
}
