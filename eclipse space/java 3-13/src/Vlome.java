import java.util.*;

public class Vlome {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		final double PI=3.14;
		
		
		System.out.print("������Բ����ĵ���뾶�͸ߣ�");
		
		double r=reader.nextDouble();
		double h=reader.nextDouble();
		
		double v=PI*r*r*h;
		
		System.out.println("Բ����ĵ���뾶Ϊ��"+r+"  ��Ϊ"+h+"  ���Ϊ"+v);
	}

}

