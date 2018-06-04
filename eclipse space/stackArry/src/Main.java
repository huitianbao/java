
public class Main {
	public static void main(String[] args){
		
	boolean i;
	stackArry s=new stackArry();
	
	i=s.isEmpty();
	System.out.println("At the begainng the stack is empty ?      "+i);
	
	
	for(int k=0;k<10;k++){
		s.push(k);
		
	}
    
	System.out.println("Now the top element of the stack is "+s.top());
	
	
	
	
	
	}
}
