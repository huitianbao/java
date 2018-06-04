
public class LinkList {
	int capacity=10;
	Object [] a=new Object [capacity];
	
	int i=0;
	public void insertFromTail(Object obj){
		Node p=new Node();
		try{
		a[i]=obj;
		i++;
		}
		catch(Exception e){
			System.out.println("Array out of index");
		}
		
		p.element=obj;
		

	}
	
	public Object deleteFromTail(){
		
		// ÒÆ¶¯Ö¸Õë
		Object obj=a[a.length-1];
		a[a.length-1]=null;
		return obj;
	}
	
	
	public void traverse(){
		for(int i=0;a[i]!=null;i++){
			System.out.print(a[i]+"->");
		}
		System.out.print("null\n");
	}
	

	

}
