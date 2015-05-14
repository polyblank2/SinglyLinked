
public class Driver {

	public static void main(String[] args) {
		Integer element1 = 5;
		SinglyLinkedList<Integer> list = new SinglyLinkedList();
		list.addFront(2);
		list.addFront(1);
		list.addFront(2);
		list.addFront(5);
		list.addFront(5);
		list.addFront(7);
		list.addFront(1);
		list.addFront(8);
		
		/*
		System.out.println(list);
		
		list.delFront();
		list.delFront();
		
		System.out.println(list);
		*/
		
		System.out.println(list);
		
		//deleteTarget(list, 1);
		//deleteTarget(list, 1);
		
		deleteDupUnique(list);
		
		System.out.println(list);
		
		System.out.println(list.getLength());
	}
	
	public static void deleteTargetFromWholeList(SinglyLinkedList list, Object target)
	{
		Node traversal = list.getHead().getNext();
		Node current = traversal;
		
		while(traversal.getNext() != null)
		{
			if(traversal.getData().equals(target))
			{
				if(traversal.getNext().equals(null))
				{
					traversal = null;
				}
				else if(traversal.getNext() != null)
				{
					current = traversal;
					
					current.setData(current.getNext().getData());
					current.setNext(current.getNext().getNext());
					
					traversal = traversal.getNext();
					traversal = null;	
					
					return;
				}
			}
			traversal = traversal.getNext();
		}
	}

	public static void deleteDupUnique(SinglyLinkedList list)
	{
		Node bookmark = list.getHead();
		
		while(bookmark.getNext() != null)
		{
			Node traversal = bookmark.getNext();
			Node current = traversal;
			Node transmute = traversal;
			
			Object target = bookmark.getData();
			while(traversal.getNext() != null)
			{
				if(traversal.getData().equals(target))
				{
					if(traversal.getNext().equals(null))
					{
						traversal = null;
					}
					else if(traversal.getNext() != null)
					{
						current = traversal;
						transmute = traversal;
						
						current.setData(current.getNext().getData());
						current.setNext(current.getNext().getNext());
						
						transmute = transmute.getNext();
						transmute = null;	
						
						break;
					}
				}
				traversal = traversal.getNext();
			}
			bookmark = bookmark.getNext();
		}
		
	}
	
	
	public static void deleteDupAbsolute(SinglyLinkedList list)
	{
		Node bookmark = list.getHead();
		
		
		while(bookmark.getNext() != null)
		{
			Node traversal = bookmark.getNext();
			Object target = bookmark.getData();
			while(traversal.getNext() != null)
			{
				deleteTargetFromWholeList(list, target);
				traversal = traversal.getNext();
			}
			bookmark = bookmark.getNext();
		}
		
	}
	
	
	//TODO In progress
	public static void deleteDuplicates(SinglyLinkedList list)
	{
		if(list.getHead().equals(null))
		{
			return;
		}
		Node bookmark = list.getHead();
		Node traversal = list.getHead();
		Node replicant = new Node(null);
		if(bookmark.getNext() != null)
		{
			traversal = list.getHead().getNext();
		}
		else
		{
			return;
		}
		//Node comparison = 
		//Object memory
		
		while(bookmark.getNext() != null)
		{
			traversal = bookmark.getNext();
			while(traversal != null || traversal.getNext() != null)
			{
				if(bookmark.getData().equals(traversal.getData()))
				{
					//make traversal become traversal.next
					//remove traversal.next as reference
					
					replicant.setData(traversal.getNext().getData());
					if(traversal.getNext().getNext() != null)
					{
						replicant.setNext(traversal.getNext().getNext());
					}
					
					traversal.getNext().setData(null);
					traversal.getNext().setNext(null);
					
					traversal = replicant;

				}
				traversal = traversal.getNext();
			}

			bookmark = bookmark.getNext();
		}
		
		
		
		
		
	}

}


