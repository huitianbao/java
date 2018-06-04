import java.util.*;

public class EqualString {

	public static void main(String[] args){
		Scanner reader=new Scanner(System.in);
		
		System.out.println("please input two strings:");
		
		String s1,s2;
		
		s1=reader.next();
		s2=reader.next();
		
		System.out.println(s1+"="+s2+"      "+s1.equals(s2));
		
	}
}




