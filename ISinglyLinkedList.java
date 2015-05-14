
public interface ISinglyLinkedList<E> {
	/*Add*/
	public void addFront(E element);
	public void addMiddle(E element, E near);
	public void addMiddle(int index);
	public void addEnd(E element);
	
	/*Remove*/
	public void delFront();
	public void delMiddle(E near);
	public void delMiddle(int index);
	public void delEnd();
	
	/*Misc*/
	public int getLength();
}
