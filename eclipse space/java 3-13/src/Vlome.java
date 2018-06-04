import java.util.*;

public class Vlome {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		final double PI=3.14;
		
		
		System.out.print("请输入圆柱体的底面半径和高：");
		
		double r=reader.nextDouble();
		double h=reader.nextDouble();
		
		double v=PI*r*r*h;
		
		System.out.println("圆柱体的底面半径为："+r+"  高为"+h+"  体积为"+v);
	}

}

