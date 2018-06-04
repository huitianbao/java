
public class ArryStack {

	public ArryStack(){}
	
	public void InitStack(Object obj){
		l.insertFromTail(obj);
		
	}
	
	
	public void ClearStack(){
		
	}
	
	public boolean StackEmpty(){
		return false;
		
	}
	
	
	public void Push(Object obj){
		l.insertFromTail(obj);
	}
	
	
	public Object Pop(){
		Object obj=l.deleteFromTail();
		
		return obj;
		
	}
	
	public void traverse(){
		l.traverse();
	}
	
	private int top;
	private LinkList l=new LinkList();
	
	
	public static void main(String[] args){
		ArryStack arraystack=new ArryStack();
		for(int i=0;i<7;i++){
			arraystack.Push(i);
			
		}
		
		
			arraystack.Pop();
			arraystack.traverse();
		
		
	}
}



