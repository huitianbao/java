//import java.util.*;

public class random {
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
		
		int t;
		for(int k=0;k<7;k++){
			
			if(a[k]>a[k+1]){
				t=a[k];
				a[k]=a[k+1];
				a[k+1]=t;
				
			}
		}
			
		
			
			
			for(int j=0;j<8;j++){
				System.out.println("a["+j+"]="+a[j]);
			}
			
			
			
		
		
		
	}
}

