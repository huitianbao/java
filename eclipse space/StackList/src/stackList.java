
public class stackList implements stackInterface{

	private Node head;
	
	
	@Override
	public void clear() {
		this.head=null;
		
	}

	@Override
	public boolean isEmpty() {
		
		return this.head==null;
	}

	@Override
	public Object top() {
		Node top=this.head;
		
		return top.element;
		
	}

	@Override
	public Object pop() {
		if(isEmpty()){
			
			throw new IllegalStateException("Õ»¿Õ");
			
			
		}
		
		Node top=this.head;
		
		Node node=new Node();
		
		
		
		
		
		return null;
	}

	@Override
	public void push() {
		// TODO Auto-generated method stub
		
	}

}
