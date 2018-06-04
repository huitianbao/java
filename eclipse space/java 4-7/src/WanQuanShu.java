import java.util.*;

public class WanQuanShu {
	
	private static boolean isWanQuan(int m){
		int sum=0;
		for(int i=1;i<m;i++){
			if(m%i==0){
				sum=sum+i;
			}
		}
		
		return sum==m;
		
		
		
	}
	public static void main(String[] args){
		
		/*
		System.out.println("please input an integer:");
		
		Scanner reader =new Scanner(System.in);
		
		
		int a=reader.nextInt();
		
		System.out.println("  "+a+"   "+isWanQuan(a));
		
		*/
		
		
		
		/*
		 * test
		 */
		
		for(int i=1;i<1000;i++){
			if(isWanQuan(i)){
				System.out.println("  "+i);
			}
		}
		
		
	
		}

}
