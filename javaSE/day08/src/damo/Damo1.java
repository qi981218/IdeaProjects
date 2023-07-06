package damo;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 16日 15:07
 * @version: 1.0
 */


import java.time.temporal.ValueRange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * map的运用
 */
public class Damo1 {
    public static void main(String[] args) {
        Map<String, String> ss = new HashMap<>();
        ss.put("itheima001", "小智");
        ss.put("itheima002", "小红");
        ss.put("itheima003", "小美");
//        System.out.println(ss);
//        System.out.println(ss.size());
//        ss.clear();
//        System.out.println(ss.size());
        //获取数据
        //1.(key遍历)利用keyset（）获取所有的键，再通过键值调用get（）方法获取值
        Set<String> keys = ss.keySet();
        for (String key : keys) {
            String value = ss.get(key);
            System.out.println("key:"+key+",value:"+value);
        }
        System.out.println("========================================");
        //2.用key-value键值对遍历(entrySet获取所有的键值对)
        Set<Map.Entry<String, String>> entries = ss.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key="+key+",value="+value);
        }


    }
}
