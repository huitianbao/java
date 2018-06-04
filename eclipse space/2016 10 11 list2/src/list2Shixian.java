
public class list2Shixian implements listint{
	
	private Node head;
	
	public list2Shixian(){
		this.head=null;
	}

	@Override
	public void clear() {
		//1 this.head=null;
		
		Node p=this.head;
		while(p!=null){
			
			head=p.next;
			
			p=p.next;
		}
		
	}

	@Override
	public boolean isEmpty() {
		
		return this.head==null;
	}

	@Override
	public Object get(int index) {
		
		if(index<1||index>length()){
			throw new IllegalArgumentException("index ∑∂Œß¥ÌŒÛ");
			
		}
		
		//“∆∂Ø÷∏’Î---------------------
		
		Node p=this.head;
		int count=0;
		while(count!=index-1){
			count++;
			p=p.next;
			
		}
		//------------------------------
		return p.element;
		
	}

	@Override
	public int locate(Object obj) {
		Node p=this.head;
		
		int count=1;
	
		while(!p.element.equals(obj)){
			count++;
			
			p=p.next;
			
		}
		
		
		return count;
		
		
	}

	@Override
	public void insert(int index, Object obj) {
		

		Node node=new Node();
		node.element=obj;
		
		
		if(index==1){
			this.head=node;
			node.next=null;
			
			
		}
		else{
		
		       //“∆∂Ø÷∏’Î---------------------
		
				Node p=this.head;
				int count=1;
				while(count!=index-1){
					count++;
					p=p.next;
					
				}
				//------------------------------
				
				//≤Â»Î‘™Àÿ
				
				node.next=p.next;
				node=p;
				
				
		}
				
		
	}

	@Override
	public Object remove(int index) {
		Node p=this.head;
		int count=1;
		while(count!=index-1){
			count++;
			p=p.next;
			
		}
		Node temp=new Node();
		temp=p.next;
		
		p=temp.next;
		
		p.next=null;
		
		return temp.element;
		
		
		
		
	}

	@Override
	public void traverse() {
		Node p=this.head;
		
		while(p!=null){
			System.out.print(p.element+"  ");
			p=p.next;
			
		}
		
	}

	@Override
	public int length() {
		int count=0;
		Node p=this.head;
		while(p!=null){
			count++;
			p=p.next;
			
		}
		return count;
	}
	

}
