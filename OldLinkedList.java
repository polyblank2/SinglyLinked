
public class OldLinkedList {
	private Node head;
	private int listCount;
	
	public OldLinkedList(){
		head = new Node(null);
		listCount = 0;
	}
	
	public void add(int data)
	{
		Node temp = new Node(data);
		Node current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		current.setNext(temp);
		listCount++;
	}
}
