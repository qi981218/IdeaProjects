/**
 * @Author 陈亚琪
 * @Date 2022/6/27 18:04
 */
public class Demo3 {
    //    3 主方法中给定数组int[] arr= {20,10,40,30,50,60};定义一个方法可以接受这个给定的数组
//            并返回这个数组中元素的最小值
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
       // System.out.println(min);
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {20, 10, 40, 30, 50, 60};
        System.out.println(min(arr));
    }
}
