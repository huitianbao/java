
	/*
	 * 
	 * 用例
	 * 
	        please input the length of l1 : 
            3
            please input 3 element of l1 :2 3 4
            please input the length of l2 : 
            3
            please input 3element of l2 : 
            3 4 5
            list 1 {2 3 4 }
            list 2 {3 4 5 }
            After remove list 1 is {2 3 4 }
            After remove list 2 is {5 }
            l1 长度  a=3
            l2 长度  b=1
                      合并之后的集合为{2 3 4 5 }
	 * 
	 * 
	 */



	import java.util.*;
	public class Main {
		
			public static void main(String[] arge){
		
				Scanner reader=new Scanner(System.in);
				
				linklist l1=new linklist();
				linklist l2=new linklist();
				int x,y,u,v;
				
				System.out.println("please input the length of l1 : ");
				//the length of l1
				u=reader.nextInt();
				System.out.print("please input"+u+"element of l1 :");
				
				for(int i=1;i<=u;i++){
					x=reader.nextInt();
					
					l1.insert(i,x);
				}
				
				
				
				System.out.println("please input the length of l2 : ");
				//the length of l2
				v=reader.nextInt();
				
				System.out.println("please input "+v+"element of l2 : ");
				for(int i=1;i<=v;i++){
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
				for(int i=1;i<=u;i++){//m    is l1
					for(int j=1;j<=v;j++){
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
				System.out.print("}\n");
				
				
				
				
				
				
				int a=l1.getLength();
				int b=l2.getLength();
				
				System.out.println("l1 长度  a="+a);
				System.out.println("l2 长度  b="+b);
				
				
				int r=a+1;
				int s=1;
				
			   do{
				   l1.insert(r, l2.get(s));
				   
				   r++;
				   s++;
				 
			   }while(r<=a+b);
			   
			   
			   
			   System.out.print("合并之后的集合为{");
			   l1.traverse();
			   System.out.print("}");
			   
			   
			   //----------------------------------------
			   
			  
			   
				
			
					
					
				}
				    	
			}
	

