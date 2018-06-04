
public interface LinkList {
	void clear();
	
	boolean isEmpty();
	
	int getLength();
	
	Object get(int index);//0 个对象,下标

	int locate(Object obj);
	
	Object prev(Object obj);
	
	Object next(Object obj);
	
	void insert(int index,Object obj);
	
	Object remove(int index);
	
	void traverese();
}
	
	
	


