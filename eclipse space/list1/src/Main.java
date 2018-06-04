/*
 * 
 * ÓÃÀı
 * 
 *      please input the length of l1 : 3
                                        
        please input3element of l1 :2 3 4
        please input the length of l2 : 3
                                        
        please input 3element of l2 : 
        3 4 5
        list 1 {2 3 4 }
        list 2 {3 4 5 }
        After remove list 1 is {2 3 4 }
        After remove list 2 is {5 }
 * 
 * 
 */



import java.util.*;
public class Main {
	
		public static void main(String[] arge){
			Scanner reader=new Scanner(System.in);
			
			linklist l1=new linklist();
			linklist l2=new linklist();
			int x,y,m,n;
			
			System.out.println("please input the length of l1 : ");
			//the length of l1
			m=reader.nextInt();
			System.out.print("please input"+m+"element of l1 :");
			
			for(int i=1;i<=m;i++){
				x=reader.nextInt();
				
				l1.insert(i,x);
			}
			
			
			
			System.out.println("please input the length of l2 : ");
			//the length of l2
			n=reader.nextInt();
			
			System.out.println("please input "+n+"element of l2 : ");
			for(int i=1;i<=n;i++){
				y=reader.nextInt();
				
				l2.insert(i,y);
			}
			System.out.print("list 1 {");
			
			l1.traverse();
			System.out.print("}\n");
			
			System.out.print("list 2 {");
			l2.traverse();
			System.out.print("}\n");
			
			int count=0;
			for(int i=1;i<=m;i++){//m    is l1
				for(int j=1;j<=n;j++){
					if(l2.get(j)==l1.get(i)){
						l2.remove(j);
						count++;
					}
				}
			}
			
			
			
			System.out.print("After remove list 1 is {");
			l1.traverse();
			System.out.print("}\n");
			
			
			
			System.out.print("After remove list 2 is {");
			l2.traverse();
			System.out.print("}");
			
			
			
			/*
			int j=1;
			do{                                 //l2 bei shan chu
				                                //2    cha dao 1 
				int i=m+1;
				
				l1.insert(i, l2.get(j));
			}while(j<=n-count);
			
            System.out.print("list 1 U list 2== {");
			
			l1.traverse();
			System.out.print("}\n");
			
			*/
			
			
			//???????????????????????????????????????????????????????
			
			linklist l3=new linklist();
			int a=l1.getLength();
			int b=l2.getLength();
			for(int k=1;k<=a;k++){
				
				Object o1=l1.get(k);
				
			    l3.insert(k,o1);
			}
			
			for(int j=a+1;j<=b+a+1;j++){
				Object o2=l2.get(j);
				
				l3.insert(j, o2);
				
				
				
			}
			    
			    
			
			
			
			
			
			
		}
}



			
			
			
			
			
			
		
		
	
			


