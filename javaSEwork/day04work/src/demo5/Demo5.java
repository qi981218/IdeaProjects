package demo5;

public class Demo5 {
    public static void main(String[] args) {
//        古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第20个月的兔子对数为多少？
//        提示： 兔子的规律
//        第1月       1对
//        第2月       1对
//        第3月       =（2月+1月）
//        第4月       =3月+2月
//        第5月       5对
//        第6月       8对
//        第7月       13对
        //n=(n-1)+n+1）
        System.out.println(jc(20));
    }
    public static int jc(int i){
        if (i==2||i==1){
            return 1;
        }else {
            return jc(i-2)+jc(i-1);
        }
    }
}
