package list;

public class main implements list2interface {

	private final Node head = null;
	private Object[] date;
	private int capacity;
	private int len;

	/*
	 * public list(){ this.capacity=1024; this.date=new.Object[this.capacity];
	 * 
	 * }
	 */
	@Override
	public void clear() {
		this.len = 0;

	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if (len == 0)
			return true;
		else
			return false;

	}

	@Override
	public int getLength() {
		// TODO Auto-generated method stub
		return this.len;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if (index < 1 || index > getLength())

			throw new IllegalArgumentException("index out of ranage");

		return this.date[index - 1];

	}

	@Override
	public int locate(Object obj) {

		// TODO Auto-generated method stub
		for (int i = 0; i < getLength(); i++) {

			if ((obj != null && obj == this.date[i])) {
				return i + 1;
			}
			return -1;
		}
	}

	@Override
	public Object prev(Object obj) {
	int pos=locate(obj);
	return get(pos-1);
	pos>1?get(pos-1):null;
	
	}

	@Override
	public Object next(Object obj) {

	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void traverse() {
		Node p = this.head;
		while (p != null) {
			System.out.println(p.element.toString() + " ");

		}

	}

	// TODO Auto-generated method stub

	@Override
	public void insert(int index, Object obj) throws Exception {
		if (index < 1 || index > getLength() + 1 || obj == null) {
			throw newIllegalArgumentException("²ÎÊý´íÎó");
		}

		int pos = index - 1;

		for (int i = getLength() - 1; i >= pos; i--) {
			this.date[i + 1] = this.date[i];
			this.date[pos] = obj;
			this.len++;

		}

	}

	private Exception newIllegalArgumentException(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
