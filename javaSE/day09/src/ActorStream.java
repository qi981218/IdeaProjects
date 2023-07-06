import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 15:37
 * @version: 1.0
 */
public class ActorStream {
    public static void main(String[] args) {
        //创建集合保存男演员
        ArrayList<String> menList = new ArrayList<>();
        menList.add("张国立");
        menList.add("杨洋");
        menList.add("王宝强");
        menList.add("李易峰");
        menList.add("孔子");
        menList.add("张龙龙");
        //创建集合保存女演员
        ArrayList<String> womenList = new ArrayList<>();
        womenList.add("anglebaby");
        womenList.add("杨紫");
        womenList.add("辣目洋子");
        womenList.add("杨幂");
        womenList.add("白百何");
        //姓名长度为三的男演员,只要前三个
        Stream<String> stream1 = menList.stream().filter(name -> name.length() == 3).limit(3);
        //姓为杨的女演员,不要第一个
        Stream<String> stream2 = womenList.stream().filter(name -> name.startsWith("杨")).skip(1);
        //合并
        Stream.concat(stream1, stream2).forEach(name -> {
            Actor actor = new Actor(name);
            System.out.println(actor);
        });


    }
}
