package demo3;

import demo2.Demo2;

/**
 * @Author 陈亚琪
 * @Date 2022/7/10 9:30
 */
/*
匿名内部类
格式：new 类名或接口名（）{}
重写方法
 */

public class Demo3 {
    public static void main(String[] args) {
        method(()-> System.out.println("88888")
        );
    }
    public static void method(Ni ni) {
        ni.cc();
        //本质：是一个继承该类或者实现了该接口的匿名对象
        //创建一个匿名内部类
//        new Demo3() {
//            @Override
//            public void method() {
//                System.out.println("匿名内部类");
//            }
//        }.method();
//        Demo3 d3 = new Demo3() {
//            @Override
//            public void method() {
//                System.out.println("匿名内部类");
//            }
//        };
//        d3.q();
//   new Ni() {
//            @Override
//            public void cc(String d3) {
//                System.out.println("555555");
//            }
//        }.cc("打篮球");



    }


}
