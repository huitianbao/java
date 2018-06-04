 import java.util.*;

public class DayuPingjunzhi {

	public double DayuPingjunzhi(Class<b[]> class1){
		double sum=0.0;
		for(int i=0;i<class1.length;i++){
			sum=sum+class1[i];
			
		}
		
		return sum/class1.length;
		
	}
	public static void main(String[] args){
		final int SIZE=10;
		
		
	
	int[] b=new int [SIZE];
	System.out.println("please input n integers:");
	Scanner reader=new Scanner(System.in);
	
	for(int i=0;i<b.length;i++){
		int c=reader.nextInt();
		b[i]=c;
			
	}
	
	
	for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
			
	}
	
	System.out.println("=======================================================================================");
	double aver=DayuPingjunzhi(b[]);
	
	
	for(int j=0;j<b.length;j++){
		if(b[j]<aver)
			continue;
		else
			System.out.println(b[j]+"    ");
	}
	
	
	
	
	
	
	
	}

}
