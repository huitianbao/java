import java.util.*;

public class ShuChu {
	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		
	boolean strend;
		do{
		System.out.println("please input some words");
		String str=reader.nextLine();
		strend=str.endsWith("exit");
		System.out.println(str);
		
		
		}while(!strend);
		
	}

}

