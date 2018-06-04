
import java.util.*;

public class S {
	public static void main(String[] args){
		
		String s1="a";
		String s3="a";
		System.out.println(s1==s3);
		
		String s2=new String("a");
		String s4=new String("a");
		System.out.println("s2==s4"+s2==s4);
		
		char ch = 'a';
		
		switch(ch){
		case 'a':
			System.out.println("a");
			break;
			
		case 'b':
			System.out.println("b");
			break;
			
			default:
				System.out.println("defsult");
		
		
		
		}
		
		
		
		
	}

}
