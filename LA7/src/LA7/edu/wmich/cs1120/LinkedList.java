package LA7.edu.wmich.cs1120;

public class LinkedList<E> {
	Node head;
	Node tail;
	
	// Determine if the LinkedList is empty.
	/**
	 * 
	 * @return head is null if the list is empty
	 */
	public boolean isEmpty() {
		
		return (head == null);
		
	}
	// Add object received to the linked list if he/she has the priority.
	/**
	 * 
	 * @param item make item type e and add it to the linked list
	 */
	public void add(E item) {
		if (isEmpty()) {
			head = new Node(item);
			tail =head;
		}else {
			Node r = new Node(item);
			tail.setNext(r);
		}
		
	}
	// get the object in specific position in the LinkedList used to print the enrolled student contents inside the Course class and return the name
	/**
	 * 
	 * @param position take the position in the linked list
	 * @return the data of that specific position
	 */
	public E get(int position) {
		Node<E> ref = head;
		for(int i =0 ; i < position;i++) {
			ref = ref.getNext();
		}
		
		return ref.getData();
		
	}
	// Return number of elements in the list.
	public int size() {
		int size=0;
		Node copy = head;
		while(copy!=null) {
			size++;
			copy = copy.getNext();
			
		}
		return size;
		
	}


}
