package demo4;

public class Demo4 {
    public static void main(String[] args) {
        //请使用递归计算5的阶乘
        System.out.println(jc(5));
    }
public static int jc(int i){

            if (i==1){
                return 1;
            }else{
                return i*jc(i-1);
            }

}
}
