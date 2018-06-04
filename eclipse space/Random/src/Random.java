//import java.util.*;

public class Random {
	public static void main(String[] args){
		//Scanner reader=new Scanner(System.in);
		
		int[] a=new int[8];
		
		for(int i=0;i<8;i++){
			a[i]=1+(int)(Math.random()*8);
			
			
		}
		System.out.println("before sort:");
		for(int i=0;i<8;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
		
		System.out.println("after sort:");
		
		
		int temp;
		
		for(int i=0;i<8;i++){

			for(int j=0;j<8;j++){
				
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int i=0;i<8;i++){
			System.out.println("a["+i+"]="+a[i]);
		}
		
		
		
		
	}
}
