/*
 * ����
 * ����
 * 1 �Ϻ� 200
 * 2 �人 300
 * 3 �Ͼ� 400
 * 4 ��� 500
 * 5 ���� 600
 * 6 ���� 300
 * �����롿1 2 3 0
 * ��������Ϻ� price 200
 *         �人 price 300
 *         �Ͼ� price 400
 * 
 */
import java.util.*;
public class Main {
	public static void main(String[] args) {
		
		Scanner reader =new Scanner(System.in);
		

		travel t = new travel();
		//travel t2 = new travel();
		

		// String c;
		// int p;

		// ���ԸĽ�

		t.insert("�Ϻ�", 200, 1);

		t.insert("�人", 300, 2);
		t.insert("�Ͼ�", 400, 3);
		t.insert("���", 500, 4);
		t.insert("����", 600, 5);
		t.insert("����", 300, 6);

		t.traverse();

		System.out.print("����������ȷ��·������ ����0����:");
		
		
		
		//Ϊ�˻�ȡ���-------------------------------
		/*
		int[] a=new int[8];
		int i=0;
		a[0]=reader.nextInt();
		
	   for(i=0;a[i]!=0;i++){
		   a[i+1]=reader.nextInt();
		   i++;
	   }
	   
	   */
		int[] a=new int[8];
		int i=0;
		while(true){
		a[i]=reader.nextInt();
		
		if(a[i]==0)
			break;

		i++;
		}
	
	  
	   
	   int j=0;
	   do{
		   System.out.print(a[j]+" ");
		   j++;
		   
	   }while(a[j]!=0);
	   System.out.println("\n");
	   
	   //--------------------------------------
	   
	   
	   
	   int x;
	 
	   
	   int k=0;
	   do{
		   x=a[k];
		   
		   switch(x){
		   case 1:  
			   System.out.println("city �Ϻ� price 200");
			   break;
		
		   case 2:
			   
			   System.out.println("city �人 price 300");
			   break;
			   
		   case 3:
			   
			   System.out.println("city �Ͼ� price 400");
			   break;
			 
		   case 4:
			   System.out.println("city ��� price 500");
			   break;
			   
		   case 5:
			   System.out.println("city ���� price 600");
			   break;
			   
		   case 6:
			   System.out.println("city ���� price 300");
			   break;
			   
			   default:
				   System.out.println("�����������������������");
		   }
		   
		   
		   k++;
		   
	   }while(a[k]!=0);
	   
	   //--------------------------------------
	   
	   
	   
	   
	   
		     
		   
	   }
	   
	   
	
		

	}


