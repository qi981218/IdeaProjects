import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 16日 19:03
 * @version: 1.0
 */
public class Demo4 {
    public static void main(String[] args) {
//        键盘录入一个字符串，请编程统计, 该字符串中每个字符出现的次数。
//        例如输入：aaaabbbcccddd，打印结果为：{a=4, b=3, c=3, d=3}key-value会出现这种效果
        //开启键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String next = sc.next();
        //将字符串转换为字符数组
        char[] chars = next.toCharArray();
      //  int value = 0;//value 初始值为0   用来字符重复出现的次数
        //创建map数组保存字符和其出现的次数
        HashMap<Character, Integer> hashMap = new HashMap<>();
//        //遍历数组
//        for (int i = 0; i < chars.length; i++) {
//            hashMap.put(chars[i], value);
//        }
//        //根据键值遍历集合
//        Set<Character> keys = hashMap.keySet();
//        for (Character key : keys) {
//            //遍历存放字符的数组
//            for (int i = 0; i < chars.length; i++) {
//                //判断该键值出现了几次
//                if (key.equals(chars[i])) {
//                    value++;
//                }
//            }
//            hashMap.put(key, value);
//            //每次存放后初始化value
//            value = 0;
//        }
//        System.out.println(hashMap);
//第二种方法：public boolean containsKey(Object key)如果此映射包含指定键的映射，则返回 true 。
        //遍历数组
        for (int i = 0; i < chars.length; i++) {
            //判断该字符是否在集合中  是的话value+1，不是的话存进集合中
            if (hashMap.containsKey(chars[i])) {
                hashMap.put(chars[i], hashMap.get(chars[i])+1);
            } else {
                hashMap.put(chars[i], 1);
            }
        }

        System.out.println(hashMap);
    }
}
