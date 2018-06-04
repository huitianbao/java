
public class stackArry implements stackArryinterface{
	
	private Object[] data;
	private int capacity;
	private int top;
	
	public stackArry(int capacity){
		this.capacity=capacity;
		this.data=new Object[this.capacity];
		this.top=0;
		
	}
	
	public stackArry(){
		this.capacity=1024;
		this.data=new Object[this.capacity];
		this.top=0;
		
	}

	@Override
	public void clear() {
		
		this.top=0;
		
		
	}

	@Override
	public boolean isEmpty() {
	
		return this.top==0;
	}

	@Override
	public Object top() {
		if(isEmpty()){
			throw new IllegalStateException("Õ»¿Õ  ");
		}
		
		
		return this.data[top-1];
		
		
	}

	@Override
	public Object pop() {
		
		if(isEmpty()){
			throw new IllegalStateException("Õ»¿Õ  ");
		}
		
		
		
		Object p=this.data[top-1];
		top--;
		
		return p;
	}

	@Override
	public void push(Object obj) {
		this.data[top]=obj;
	
		top++;
		//this.date[this.top++]=obj;
	}
	

}
