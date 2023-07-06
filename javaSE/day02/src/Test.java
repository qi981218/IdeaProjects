import java.sql.SQLOutput;

/**
 * @Author 陈亚琪
 * @Date 2022/6/22 20:05
 */
public class Test {
    public static void main(String[] args) {
//        ## 题目1(训练)
//        身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
//​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
//​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
//        现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
        int father = 177;
        int monther = 165;
        System.out.println("儿子身高（厘米）＝" + (father + monther) * 1.08 / 2);
        System.out.println("女儿身高（厘米）＝" + (father * 0.923 + monther) / 2);
//     ## 题目2（训练）
//        红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？
        int RedGril = 21;
        int greenGril = 24;
        System.out.println( (RedGril * 2 + 3) == (greenGril * 2) ? "对" : "错");
//        题目3（综合）
//        某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
double  zheKou=(24+8+3)*0.8;
double   youHui=16+8+3;
        System.out.println("最少要花"+(zheKou>youHui?youHui:zheKou)+"元");

    }
}
