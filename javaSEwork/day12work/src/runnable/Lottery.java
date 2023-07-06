package runnable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 陈亚琪
 * @date 2022年07月24日 19:44
 * @version: 1.0
 */
public class Lottery extends Thread {

    static String[] box = {"电视机", "电冰箱", "电脑", "游戏机", "洗衣机", "空调", "手机", "平板电脑", "电动车", "电饭"};
    //将数组转换为集合
    static List<String> boxs = new ArrayList<>(Arrays.asList(box));
    //创建集合用来保存数据
      List<String> list = new ArrayList<>();

    @Override
    public void run() {

        while (true) {
            synchronized (Lottery.class) {
                //获取奖池里面奖品的数量
                int count = boxs.size();
                //开始抽奖
                if (count > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //获取随机奖品
                    int i = (int) (Math.random() * count);
                    // System.out.println(i);
                    //将奖品存入集合
                    //System.out.println(boxs.get(i));

                    list.add(boxs.get(i));
                    //将该奖品从集合中删除
                    boxs.remove(i);
                } else {
                    System.out.println(Thread.currentThread().getName() + list);
                    break;
                }

            }

        }
    }
}
