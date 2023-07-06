package demo1;

/**
 * @Author 陈亚琪
 * @Date 2022/7/9 20:57
 * 格式
 * public class 类名{
 * <p>
 * 修饰符  class  类名{}
 * <p>
 * <p>
 * }
 */
public class Demo1 {
    //定义外部类变量
    private int a = 100;
    //创建内部类De
    /*
    内部类可以直接访问外部类的成员，包括私有的
    外部类必须创建对象才能访问内部类的成员
     */
//    public class De {
//        public void show(){
//            System.out.println(a);
//        }
//
//
//
//    }
    //成员内部类:在类中定义

    private class De {
        public void show() {
            System.out.println(a);
        }


    }

    //创建外部类方法
    public void method() {
        //实例化内部类   调用内部类的方法
        De d = new De();
        d.show();
    }

//    public static void main(String[] args) {
//        Demo1 demo1 = new Demo1();
//        demo1.method();
//
//    }


}
