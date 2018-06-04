
import java.util.*;



//    为什么 switch   不能循环   ？？？？？？？？
public class switchs {
	
	/**
	 * @param args
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
	/*	
		System.out.print("please input an integer amount 1~100:");
		Scanner reader =new Scanner(System.in);
		
		int a=reader.nextInt();
		int b=a/10;
		
		
		switch(a){
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("不及格");
	
			break;
			
		case 6:
		System.out.println("及格");
		break;
		
		case 7:
			System.out.println("中");
			break;
			
		case 8:
			System.out.println("良");
			break;
			
		case 9:
		case 10:
			System.out.println("优");
			break;
			
			default:
				System.out.println("请输入1~100之间的数");
				break;
		
		
		}
		
		*/
		
		System.out.println("======================================================================================");
		
		int i;
		
		for(i=1;i<11;i++){
			
			switch(i){
			
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("不及格"+i);
				break;
				
				
			case 6:
			System.out.println("及格"+"  "+i);
			break;
			
			case 7:
				System.out.println("中"+"    "+i);
				break;
				
			case 8:
				System.out.println("良"+"    "+i);
				
			case 9:
			case 10:
				System.out.println("优"+"    "+i);
				break;
				
				default:
					System.out.println("请输入1~100之间的数"+"      "+i  );
			    break;
			    
			    
			    
			
			}
			
			
			
			
		}
	}

}
