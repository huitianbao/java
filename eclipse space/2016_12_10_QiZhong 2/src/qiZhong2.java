import java.util.*;

public class qiZhong2 {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		int a;
		do{
		System.out.println("please input 4 wei zheng shu:");
		
		a=reader.nextInt();
		}while(a<=0||a>9999);
		
		
		int x,y,z,w;
		int sum;
		x=a/1000;
		
		//y=(a-x*1000)/100;
		y=(a%1000)/100;
		
		
		//z=(a-x*1000-y*100)/10;
		z=((a%1000)%100)/10;
		
		//w=(a-x*1000-y*100-z*10);
		w=(((a%1000)%100)%10);
		
		sum=x+y+z+w;
		System.out.println("fen li "+"x="+x+"   y="+y+"   z="+z+"   w="+w+"   sum="+sum);
		
		
	}

}
