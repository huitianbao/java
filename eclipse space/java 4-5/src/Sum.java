import java.util.*;

public class Sum {
	private static double tongxiang(int n){
	double a=(1/jiecheng(n))*xishu(n);	
		
		return a;
	}
	
	private static int xishu(int n){
		if(n%2==0){
			return -1;
		}
		else{
			return 1;
		}
	}
	
	
	private static long jiecheng(int n){
		long answer=1;
		
		for(int i=1;i<=n;i++){
			answer=answer*i;
		}
		
		return answer;
		
	}
	
	private static double qiuhe(int n){
		double su=0.0D;
		
		for(int i=1;i<=n;i++){
			su=su+tongxiang(i);
			
		}
		
		return su;
	}

	
	
	public static void main(String[] args){
		for(int j=1;j<10;j++){
			System.out.println(""+j+"      "+qiuhe(j));
		}
	}
}
