package linklist;

public class linklist implements List {
	
	public Object[] date;
	public int capacity;
	public int len;
	
	
	
public void clear() {
	
}
	
	boolean isEmpyt() {
		return false;
	}
	
	int getLength();
	
	Object get(int index);
	
	int locate(Object obj);
	
	Object prev(Object obj);
	
	Object next(Object obj);
	
	void remove(int index);
	
	void traverse();
}
