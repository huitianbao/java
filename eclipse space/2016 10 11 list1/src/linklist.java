
public class linklist implements listint {
	

		private Node header;

		public linklist() {
			this.header = null;
		}

		@Override
		public void clear() {
			// 1 this.header=null;
			Node p = this.header;
			while (p != null) {
				this.header = p.next;
				p = p.next;
			}

		}

		@Override
		public boolean isEmpty() {

			return this.header == null;
		}

		@Override
		public int getLength() {

			Node p = this.header;
			int count = 0;

			while (p != null) {
				count++;
				p = p.next;
			}

			return count;
		}

		@Override
		public Object get(int index) {
			/*
			if(index<1||index>getLength()){
				throw new IllegalArgumentException("index ��Χ����");
				
			}
			*/
			
			//����֮��ͱ���  to do ...............
			
			Node p = this.header;
			int count = 0;
			while (p!=null) {
				count++;
				if(count==index){
					return p.element;	
				}
				p = p.next;

			}
			return null;
			

		}

		@Override
		public void insert(int index, Object obj) {
			/*
			if(index<1||index>getLength()){
				throw new IllegalArgumentException("index ��Χ����");
				
			}
			*/
			//����֮��ͱ���  to do ...............
			
			
			if (index == 1) {
				Node node = new Node();
				node.element = obj;
				node.next = this.header;
				this.header = node;

			} else {

				Node node = new Node();           
				Node p = this.header;

				// �ƶ�ָ��
				int count = 0;
				while (p != null) {
					count++;
					if (count == index - 1)
						break;

					p = p.next;
				}

				node.next = p.next;
				p.next = node;

				node.element = obj;
			}
		}

		@Override
		public Object remove(int index) {
			
			/*
			if(index<1||index>getLength()){
				throw new IllegalArgumentException("index ��Χ����");
				
			}
			*/
			//����֮��ͱ���  to do ...............
			
			

			Node p = this.header;

			if (index < 1 || index > getLength()) {
				throw new IllegalArgumentException("��������");
			}

			if (index == 1) {
				Node temp = this.header;
				this.header = temp.next;
			}

			else {
				// �ƶ�ָ��
				int count = 0;

				while (p != null) {
					count++;
					if (count == index - 1)
						break;
					p = p.next;
				}

				// delete element
				Node temp = p.next;
				p.next = temp.next;
				temp.next = null;

			}
			return null;
		}

		@Override
		public void traverse() {
			Node p = this.header;
			while (p != null) {
				System.out.print(p.element.toString() + " ");
				p=p.next;

			}

		}

	}


