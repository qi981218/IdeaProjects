package demo5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: 陈亚琪
 * @CreateTime: 2022-07-14  20:27
 * @Version: 1.0
 */
public class CollectionTest {
    public static void main(String[] args) {
//        定义一个Collection类型的集合，存储以下字符串：
//      “JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
        Collection<String> collection = new ArrayList<>();
//        请编程实现以下功能：

        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");
        Iterator<String> it = collection.iterator();
//        1. 使用迭代器遍历所有元素，并打印
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        2. 使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
        System.out.println("-------------------");
        it = collection.iterator();
        while (it.hasNext()){
            String s=it.next();
            if(s.length()<10){
            System.out.println(s);
            }
        }
//        3. 使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        System.out.println("---------------------------------");
        it = collection.iterator();
        while (it.hasNext()){
            String s=it.next();
            if(s.contains("Java")){
                System.out.println(s);
            }
        }
//        4. 如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        System.out.println("---------------------------------");
        it = collection.iterator();
        while (it.hasNext()){
            String s=it.next();
            if(s.contains("Oracle")){
                it.remove();
            }
        }
        it = collection.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
