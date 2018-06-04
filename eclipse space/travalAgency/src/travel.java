
public class travel implements travelAgency{
	
	private Node head;
	
	public travel(){
		this.head=null;
	}
	
	
	
	

	@Override
	public void insert(String city,int price,int index) {
		
		if(index==1){
			Node node=new Node();
			node.city=city;
			node.price=price;
			
			node.next=this.head;//??????????????????????????
			this.head=node;
			
		}
		else
		{
			
			Node p=this.head;
			int count=0;
			/*
			while(count!=index-1){
				count++;
				p=p.next;
			}
			
			*/
			while(p!=null){
				count++;
				if(count==index-1){
					break;
				}
				p=p.next;
			}
			
			Node node=new Node();
			node.city=city;
			node.price=price;
			
			node.next=p.next;
			p.next=node;
			
			}
			
			
			
		}
		
		
		
	

	@Override
	public String remove(int index) {
		
		Node p=this.head;
		int count=0;
		
		while(count!=index-1){
			count++;
			p=p.next;
		}
       Node temp=new Node();
       temp=p.next;
       p.next=temp.next;
       
       return temp.city;
       
		
	}

	@Override
	public void traverse() {
		Node p=head;
		System.out.println("the list of the city：");
		
		int i=0;
		while(p!=null){
			
			i++;
			System.out.print(" "+i+p.city+"   "+p.price+"\n");
			
			p=p.next;//----------------------一开始忘写了
			
		}
		
	}





	@Override
	public void clear() {
		this.head=null;
		
	}

}
