public interface list {
	void clear();

	boolean isEmpty();
	
	int getLength();
	
	Object get(int index);
	

	void insert(int index, Object obj);

	Object remove(int index);

	void traverse();

}
