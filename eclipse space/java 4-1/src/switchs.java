
import java.util.*;



//    Ϊʲô switch   ����ѭ��   ����������������
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
			System.out.println("������");
	
			break;
			
		case 6:
		System.out.println("����");
		break;
		
		case 7:
			System.out.println("��");
			break;
			
		case 8:
			System.out.println("��");
			break;
			
		case 9:
		case 10:
			System.out.println("��");
			break;
			
			default:
				System.out.println("������1~100֮�����");
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
				System.out.println("������"+i);
				break;
				
				
			case 6:
			System.out.println("����"+"  "+i);
			break;
			
			case 7:
				System.out.println("��"+"    "+i);
				break;
				
			case 8:
				System.out.println("��"+"    "+i);
				
			case 9:
			case 10:
				System.out.println("��"+"    "+i);
				break;
				
				default:
					System.out.println("������1~100֮�����"+"      "+i  );
			    break;
			    
			    
			    
			
			}
			
			
			
			
		}
	}

}
