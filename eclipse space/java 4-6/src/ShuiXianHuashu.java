import java.util.*;

public class ShuiXianHuashu {
	public static void main(String[] args){
		System.out.println("输出所有的水仙花数");
		
		int a,b,c;
		
		for(int i=100;i<1000;i++){
			a=i/100;
			b=(i-a*100)/10;
			c=i%10;
			
			if(a*a*a+b*b*b+c*c*c==i){
				System.out.println("   "+i);
			}
			
			
		}
	}

}
