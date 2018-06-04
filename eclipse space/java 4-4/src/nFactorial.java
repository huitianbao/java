import java.util.*;

public class nFactorial {

	private static  long factorial(int n){
        long sum=1;
        
		 for(int i=1;i<=n;i++){
			 sum=sum*i;
			 
		 }
		 
		 return sum;
		 
	}
	
	
	private static long qiuhe(int n){
		long sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+factorial(i);
			
		}
		
		return sum;
	}
	public static void main(String[] args){
		
		/*
		 * test code
		 
		for(int i=1;i<20;i++){
			System.out.println("1!+......+"+i+"="+qiuhe(i));
		}
		
	*/
		
		
		
		System.out.print("plsase input n:");
		Scanner reader =new Scanner(System.in);
		int n=reader.nextInt();
		
		System.out.println("1!+......+"+n+"="+qiuhe(n));
		
		
		
		
		
	}
}
