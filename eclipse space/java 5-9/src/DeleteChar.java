import java.util.*;

public class DeleteChar {
	public static void main(String[] args){
		
		Scanner reader=new Scanner(System.in);
		System.out.print("please input a string and the char you want to delete:");
		
		String s=reader.next();
		String s2=reader.next();
		
		int index=s.indexOf(s2);
		System.out.println(""+s.substring(0, index)+s.substring(index+1, s.length()));
		//System.out.print(s.substring(index+1, s.length()));
		
		
	}

}
