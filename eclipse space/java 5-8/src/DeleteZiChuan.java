import java.util.*;

public class DeleteZiChuan {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("please input a string");
		String s = reader.next();

		System.out.print("please input location and length");
		String ch = reader.next();
		int len = reader.nextInt();

		System.out.println(s.substring(s.indexOf(ch), (s.indexOf(ch) + len)));

		/*
		 * int start=s.indexOf(ch); //int i=start;
		 * 
		 * 
		 * 
		 * for(int i=start;i<=len;i++){ System.out.print(s.charAt(i)); }
		 * 
		 */

	}

}
