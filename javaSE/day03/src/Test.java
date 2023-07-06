import java.util.Scanner;

/**
 * @Author 陈亚琪
 * @Date 2022/6/23 0:42
 */
public class Test {
    public static void main(String[] args) {
//        目1（训练）
//        李雷想买一个价值7988元的新手机，她的旧手机在二手市场能卖1500元，而手机专卖店推出以旧换新的优惠，
//        把她的旧手机交给店家，新手机就能够打8折优惠。为了更省钱，李雷要不要以旧换新？请在控制台输出。
        int newPhone = 7988;
        int old = 1500;
        System.out.println(newPhone * 0.8 > (newPhone - old) ? "不要以旧换新" : "要以旧换新");
        if (newPhone * 0.8 > (newPhone - old)) {
            System.out.println("不要以旧换新");
        } else {
            System.out.println("要以旧换新");
        }
        //2.让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台。
        int[] int1 = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个整数(按回车输入下一个)：");
        for (int i = 0; i < 3; i++) {
            int1[i] = sc.nextInt();
        }
        int temp;
        //排序
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2 - i; j++) {
                if (int1[j] > int1[j + 1]) {
                    temp = int1[j];
                    int1[j] = int1[j + 1];
                    int1[j + 1] = temp;
                }

            }
        }
        System.out.println("三个数中的最小值为：" + int1[0]);
//        某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
//​	存期		年利率（%）
//​	一年		2.25
//​	两年		2.7
//​	三年		3.25
//​	五年		3.6
        while (true) {
            System.out.println("请输入存入金额（1000起）：");
            int money = sc.nextInt();
            if (money >= 1000) {
                System.out.println("请选择存入年限：1年   2年   3年   5年");
                int year = sc.nextInt();
                switch (year) {
                    case 1:
                        System.out.println("本息总额为:" + (money + money * (2.25 / 100) * year));
                        break;
                    case 2:
                        System.out.println("本息总额为:" + (money + money * (2.7 / 100) * year));
                        break;
                    case 3:
                        System.out.println("本息总额为:" + (money + money * (3.25 / 100) * year));
                        break;
                    case 4:
                        System.out.println("本息总额为:" + (money + money * (3.6 / 100) * year));
                        break;
                    default:
                        System.out.println("请重新选择存入年限");
                        continue;
                }
                break;
            } else {
                System.out.println("1000起存，请重新输入存入金额：");
            }
        }

//    某商场购物可以打折，具体规则如下：
//​	普通顾客购不满100元不打折，满100元打9折；
//​	会员购物不满200元打8折，满200元打7.5折；
//​	不同打折规则不累加计算。
//    请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。
        System.out.println("购物的折前金额（整数即可）:");
        int m = sc.nextInt();
        System.out.println("请输入顾客的类别：0表示普通顾客，1表示会员");
        int a = sc.nextInt();
        switch (a) {
            case 0:
                if (m >= 100) {
                    System.out.println("应付金额:" + m * 0.9);
                } else {
                    System.out.println("应付金额:" + m);
                }
                break;
            case 1:
                if (m >= 200) {
                    System.out.println("应付金额:" + m * 0.75);
                } else {
                    System.out.println("应付金额:" + m * 0.8);
                }
                break;
        }

//        2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金
//
//（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。
// 如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
//​	0 ~ 3000元的部分，交税3%
//​	3000 ~ 12000元的部分，交税10%
//​	12000 ~ 25000的部分 ， 交税20%
//​	25000 ~ 35000的部分，交税25%
//​	35000 ~ 55000的部分，交税30%
//​	55000 ~ 80000的部分，交税35%
//​	超过80000的部分，交税45%
//        比如：黑马某学员入职一家企业后，税前工资是15000，
//        则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
        //        请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
        System.out.println("请输入税前工资：");
        while (true) {
            double shuiBefore = sc.nextInt();//税前工资
            if (shuiBefore > 5000) {
                shuiBefore=shuiBefore-shuiBefore*0.1;
                double jiaoShui = shuiBefore -5000;//交税部分金额
                if (jiaoShui >= 0 && jiaoShui <= 3000) {
                    //​	0 ~ 3000元的部分，交税3%
                    System.out.println("纳税金额为：" + jiaoShui * 0.03);
                    System.out.println("税后工资为：" + (shuiBefore - jiaoShui * 0.03));
                } else if (jiaoShui >= 3000 && jiaoShui <= 12000) {
                    //​	0 ~ 3000元的部分，交税3%
                    //​	3000 ~ 12000元的部分，交税10%
                    System.out.println("纳税金额为：" + 3000 * 0.03 + (jiaoShui - 3000) * 0.1);
                    System.out.println("税后工资为：" + (shuiBefore - (3000 * 0.03 + (jiaoShui - 3000) * 0.1)));
                } else if (jiaoShui >= 12000 && jiaoShui <= 25000) {
                    //​	0 ~ 3000元的部分，交税3%
                    //​	3000 ~ 12000元的部分，交税10%
                    //​	12000 ~ 25000的部分 ， 交税20%
                    System.out.println("纳税金额为：" + (3000 * 0.03 + 12000 * 0.1 + (jiaoShui - 12000) * 0.2));
                    System.out.println("税后工资为：" + (shuiBefore - (3000 * 0.03 + 12000 * 0.1 + (jiaoShui - 12000) * 0.2)));
                } else if (jiaoShui >= 25000 && jiaoShui <= 35000) {
                    //​	0 ~ 3000元的部分，交税3%
                    //​	3000 ~ 12000元的部分，交税10%
                    //​	12000 ~ 25000的部分 ， 交税20%
                    //​	25000 ~ 35000的部分，交税25%
                    System.out.println("纳税金额为：" + (3000 * 0.03 + 12000 * 0.1 + 25000 * 0.2 +
                            (jiaoShui - 25000) * 0.25));
                    System.out.println("税后工资为：" + (shuiBefore - (3000 * 0.03 + 12000 * 0.1 +
                            25000 * 0.2 + (jiaoShui - 25000) * 0.25)));

                } else if (jiaoShui >= 35000 && jiaoShui <= 55000) {
                    //​	0 ~ 3000元的部分，交税3%
                    //​	3000 ~ 12000元的部分，交税10%
                    //​	12000 ~ 25000的部分 ， 交税20%
                    //​	25000 ~ 35000的部分，交税25%
                    //​	35000 ~ 55000的部分，交税30%
                    System.out.println("纳税金额为：" + (3000 * 0.03 + 12000 * 0.1 + 25000 * 0.2 +
                            35000 * 0.25 + (jiaoShui - 35000) * 0.3));
                    System.out.println("税后工资为：" + (shuiBefore - (3000 * 0.03 + 12000 * 0.1 +
                            25000 * 0.2 + 35000 * 0.25 + (jiaoShui - 35000) * 0.3)));
                }else if(jiaoShui>=55000&&jiaoShui<=80000){
                    //​	0 ~ 3000元的部分，交税3%
                    //​	3000 ~ 12000元的部分，交税10%
                    //​	12000 ~ 25000的部分 ， 交税20%
                    //​	25000 ~ 35000的部分，交税25%
                    //​	35000 ~ 55000的部分，交税30%
                    //​	55000 ~ 80000的部分，交税35%
                    System.out.println("纳税金额为：" + (3000 * 0.03 + 12000 * 0.1 + 25000 * 0.2 + 35000 * 0.25
                            + 55000 * 0.3+(jiaoShui - 55000)*0.35));
                    System.out.println("税后工资为：" + (shuiBefore - (3000 * 0.03 + 12000 * 0.1 + 25000 * 0.2 +
                            35000 * 0.25 + 55000 * 0.3+(jiaoShui - 55000)*0.35)));
                }else if(jiaoShui>=80000){
                    //​	0 ~ 3000元的部分，交税3%
                    //​	3000 ~ 12000元的部分，交税10%
                    //​	12000 ~ 25000的部分 ， 交税20%
                    //​	25000 ~ 35000的部分，交税25%
                    //​	35000 ~ 55000的部分，交税30%
                    //​	55000 ~ 80000的部分，交税35%
                    //​	超过80000的部分，交税45%
                    System.out.println("纳税金额为：" + (3000 * 0.03 + 12000 * 0.1 + 25000 * 0.2 + 35000 * 0.25
                            + 55000 * 0.3+80000*0.35+(jiaoShui - 80000)*0.45));
                    System.out.println("税后工资为：" + (shuiBefore - (3000 * 0.03 + 12000 * 0.1 + 25000 * 0.2 +
                            35000 * 0.25 + 55000 * 0.3+ 80000*0.35+(jiaoShui - 80000)*0.45)));
                }

            } else if (shuiBefore <= 500 && shuiBefore >= 0) {
                System.out.println("税后工资为：" + shuiBefore);
            } else {
                System.out.println("输入错误，谁签收工资不能为负数，请重新输入：");
            }
        }


    }
}

