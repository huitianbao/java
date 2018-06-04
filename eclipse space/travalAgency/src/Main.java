/*
 * 用例
 * 输入
 * 1 上海 200
 * 2 武汉 300
 * 3 南京 400
 * 4 天津 500
 * 5 杭州 600
 * 6 苏州 300
 * 【输入】1 2 3 0
 * 【输出】上海 price 200
 *         武汉 price 300
 *         南京 price 400
 * 
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner reader =new Scanner(System.in);
		

		travel t = new travel();
		//travel t2 = new travel();
		

		// String c;
		// int p;

		// 可以改进

		t.insert("上海", 200, 1);

		t.insert("武汉", 300, 2);
		t.insert("南京", 400, 3);
		t.insert("天津", 500, 4);
		t.insert("杭州", 600, 5);
		t.insert("苏州", 300, 6);

		t.traverse();

		System.out.print("请输入数字确定路线输入 数字0结束:");
		
		
		
		//为了获取序号-------------------------------
		/*
		int[] a=new int[8];
		int i=0;
		a[0]=reader.nextInt();
		
	   for(i=0;a[i]!=0;i++){
		   a[i+1]=reader.nextInt();
		   i++;
	   }
	   
	   */
		int[] a=new int[8];
		int i=0;
		while(true){
		a[i]=reader.nextInt();
		
		if(a[i]==0)
			break;

		i++;
		}
	
	  
	   
	   int j=0;
	   do{
		   System.out.print(a[j]+" ");
		   j++;
		   
	   }while(a[j]!=0);
	   System.out.println("\n");
	   
	   //--------------------------------------
	   
	   
	   
	   int x;
	 
	   
	   int k=0;
	   do{
		   x=a[k];
		   
		   switch(x){
		   case 1:  
			   System.out.println("city 上海 price 200");
			   break;
		
		   case 2:
			   
			   System.out.println("city 武汉 price 300");
			   break;
			   
		   case 3:
			   
			   System.out.println("city 南京 price 400");
			   break;
			 
		   case 4:
			   System.out.println("city 天津 price 500");
			   break;
			   
		   case 5:
			   System.out.println("city 杭州 price 600");
			   break;
			   
		   case 6:
			   System.out.println("city 苏州 price 300");
			   break;
			   
			   default:
				   System.out.println("输入的数字有误，请重新输入");
		   }
		   
		   
		   k++;
		   
	   }while(a[k]!=0);
	   
	   //--------------------------------------
	   
	   
	   
	   
	   
		     
		   
	   }
	   
	   
	
		

	}


