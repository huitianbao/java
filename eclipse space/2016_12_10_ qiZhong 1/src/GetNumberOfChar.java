import java.util.*;

public class GetNumberOfChar{
	public static void main(String[] args){
		
		Scanner reader=new Scanner(System.in);
		
		System.out.println("plaese input a String and a char");
		String s,c;
		s=reader.next();
		c=reader.next();
		
		char ch;
		ch=c.charAt(0);
		
		int count=0;
		for(int i=0;i<s.length();i++){
			if(ch==s.charAt(i)){
				count++;
			}
		}
		
		
		System.out.print("String   "+s+"  has "+count+" "+ch);
		
	}
	

}
