public class Node<E> {
	private Node next = null;
	private E data;
	public Node(E d) {this.setData(d);}
	
	@Override public String toString()
	{
		return getData().toString();
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

	E getData() {
		return data;
	}

	void setData(E data) {
		this.data = data;
	}
	
}