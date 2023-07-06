package demo2;

/**
 * @Author 陈亚琪
 * @Date 2022/7/10 9:19
 */
public class Demo2 {
    public int a = 22;

    //定义局部内部类：在类的方法中定义
    public void method() {
        //定义局部变量
        String name = "傻逼";
        //局部内部类既可以调用外部类成员  也可以调用方法内的变量
        class De {
            public void show() {
                System.out.println(a);
                System.out.println(name);
            }

        }
        //实例化内部类并调用方法（只能在定义内部类的方法中使用）
        De de = new De();
        de.show();


    }


}
