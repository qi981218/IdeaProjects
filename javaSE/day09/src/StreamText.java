
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

/**
 * @author 陈亚琪
 * @datetime 2022年 07月 18日 11:19
 * @version: 1.0
 */
//stream流
public class StreamText {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("张三","张三丰","123"));
        list.stream().filter(s ->s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));
        list.stream().filter(
                s -> {
                    boolean result = s.startsWith("张");
                    return result;
                }
        );

    }

}
