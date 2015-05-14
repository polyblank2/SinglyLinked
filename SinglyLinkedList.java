
public class SinglyLinkedList<E> implements ISinglyLinkedList {
	private Node head;
	
	@Override public String toString()
	{
		Node current = getHead();
		StringBuilder contents = new StringBuilder();
		contents.append("{");
		while(current.getNext() != null)
		{
			contents.append(current.getData().toString());
			if(current.getNext().getNext() != null)
			{
				contents.append(",");				
			}
			current = current.getNext();
		}
		contents.append("}");
		return contents.toString();
	}
	
	public void SinglyLinkedList(E data)
	{
		this.setHead(new Node(data));
		this.getHead().setNext(null);		
	}
	
	@Override
	public void addFront(Object element) {
		Node added = new Node(element);
		added.setNext(this.getHead());
		this.setHead(added);
	}

	@Override
	public void addMiddle(Object element, Object near) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addMiddle(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addEnd(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delFront() {
		if(this.getHead().getNext() != null)
		{
			Node current = this.getHead().getNext();
			this.setHead(current);			
		}
	}

	@Override
	public void delMiddle(Object near) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delMiddle(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delEnd() {
		// TODO Auto-generated method stub
		
	}

	Node getHead() {
		return head;
	}

	void setHead(Node head) {
		this.head = head;
	}

	@Override
	public int getLength() {
		Node current = this.getHead();
		int length = 0;
		while(current.getNext() != null)
		{
			length ++;
			current = current.getNext();
		}
		return length;
	}


}
