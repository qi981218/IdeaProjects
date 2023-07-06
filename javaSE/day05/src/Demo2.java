/**
 * @Author 陈亚琪
 * @Date 2022/6/27 17:33
 */
public class Demo2 {
    // 2 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
    public static void sun() {
        int a = (int) (Math.random() * 100 + 1);
        System.out.println(a);
        int b = (int) (Math.random() * 100 + 1);
        System.out.println(b);
        System.out.println("a" + "+" + "b" + "=" + (a + b));

    }

    public static void main(String[] args) {
        sun();
    }

}
