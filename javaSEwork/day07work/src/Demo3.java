import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 16日 18:45
 * @version: 1.0
 */
public class Demo3 {
    public static void main(String[] args) {
//        假如你要统计街道两旁的店铺信息, 请使用HashMap集合保存这些信息.
//                信息如下:
//        101,阿三面馆
//        102,阿四粥馆
//        103,阿五米馆
//        104,阿六快递
//        要求:
//        1. 门牌号时int类型, 作为键,
//                2. 店铺名称为String类型, 作为值,
//                3. 请使用至少两种方式遍历输出这些信息;

        HashMap<Integer, String> ha = new HashMap<>();
        ha.put(101, "阿三面馆");
        ha.put(102, "阿四粥馆");
        ha.put(103, "阿五米馆");
        ha.put(104, "阿六快递");
        //遍历
        //1.利用key进行遍历
        Set<Integer> keys = ha.keySet();//获取所有的key值
        //遍历key值并根据key获取value
        for (Integer key : keys) {
            String value = ha.get(key);
            System.out.println("key:" + key + "     value:" + value);
        }
        System.out.println("=====================");
        //2.直接获取所有的key，value并遍历
        Set<Map.Entry<Integer, String>> entries = ha.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "     value:" + value);
        }


    }
}
