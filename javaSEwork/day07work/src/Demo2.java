import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 16日 18:20
 * @version: 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
//        键盘录入一个字符串，去掉其中重复字符，打印出不同的那些字符，必须保证顺序。
//        例如输入：aaaabbbcccddd，打印结果为：[a, b, c, d]
//        提示(LinkedHashSet)
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String input = sc.next();
        //创建一个集合用来保存字符串
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        //遍历字符串
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            System.out.println(c);
            linkedHashSet.add(String.valueOf(c));
        }
        System.out.println(linkedHashSet);

    }
}
