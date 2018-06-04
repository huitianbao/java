package list;

public interface list2interface {

	void clear();

	boolean isEmpty();

	int getLength();

	Object get(int index);

	int locate(Object obj);

	Object prev(Object obj);

	Object next(Object obj);
	
	void insert(int index,Object obj);

	Object remove(int index);

	void traverse();

}
