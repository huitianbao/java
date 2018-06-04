package linklist;

public interface list {
	
	void clear();
	
	boolean isEmpyt();
	
	int getLength();
	
	Object get(int index);
	
	int locate(Object obj);
	
	Object prev(Object obj);
	
	Object next(Object obj);
	
	void remove(int index);
	
	void traverse();
	

}
