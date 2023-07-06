import java.util.Random;


public class Test {
	public static void main(String[] args) {
		//定义数组
    	int[] arr=new int[5];
    	Random random = new Random();
// 利用随机数生成5个范围为2-10（包含2和10）之间的整数存入到数组中(随机数可重复)
        //______________1_____________________
		for (int i = 0; i < arr.length; i++) {
			arr[i]=random.nextInt(9)+2;
			System.out.println(arr[i]);
		}
    	
    	//定义变量
    	int max=arr[0];
    	int min=arr[0];
    	int sum=0;
    	
    	//求出最大值
      //______________2_____________________
		for (int i = 0; i <arr.length ; i++) {
			if (arr[i]>max){
				max=arr[i];
			}
		}
    	
    	//求出最小值
      //______________3_____________________
		for (int i = 0; i <arr.length ; i++) {
			if (arr[i]<min){
				min=arr[i];
			}
		}
       //求累加和
        for (int i = 0; i < arr.length; i++) {		
		  sum+=arr[i];
    }
        
    	//分别打印出最大值、最小值以及数组总和到控制台
    	System.out.println();
    	System.out.println("最大值为："+max);
    	System.out.println("最小值为："+min);
    	System.out.println("累加和为："+sum);
  }
}