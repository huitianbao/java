import java.util.*;
import java.io.*;


public class shuru {
	public static void main(String[] args){
		
	
	Scanner reader=new Scanner(System.in);
	
	System.out.print("please input something");
	
	String s=reader.next();
	
	System.out.println(s);
	
	
	BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("please input something again:");
	try {
		String ss=buf.readLine();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	String str;
	str=Integer.toString(ss);//                     bufferReader    hai shi bu hui   2017_1_8
	
	
	
	System.out.println(str);
	
	
	
	
	
	
	}
}
