import java.util.*;

public class switch2 {
	public static void main(String[] args){
		
		/*
		System.out.print("please input an integer amount 1~100:");
		Scanner reader =new Scanner(System.in);
		
		int a=reader.nextInt();
		int b=(a-1)/5;
		*/
		for(int b=0;b<21;b++){
		switch(b){
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("D"+"    "+b);
			break;
			
		case 13:
		case 14:
			System.out.println("C"+"     "+b);
			break;
			
		case 15:
		case 16:
			System.out.println("B"+"     "+b);
			break;
			
		case 17:
		case 18:
		case 19:
		case 20:
			System.out.println("A"+"     "+b);
			break;
			
			
			default:System.out.println("please input an integer amout 0~100");
			
		}
		
		}
		
	}

}
