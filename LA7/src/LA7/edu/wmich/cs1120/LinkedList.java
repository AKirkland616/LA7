package LA7.edu.wmich.cs1120;

public class LinkedList<E> {
	Node list;// = new Node(null);
	
	// Determine if the LinkedList is empty.
	public boolean isEmpty() {
		
		return (list == null);
		
	}
	// Add object received to the linked list if he/she has the priority.
	public void add(E item) {
		if (isEmpty()) {
			list = new Node(item);
		}else {
			Node r = new Node(item);
			list.setNext(r);
		}
		
	}
	// get the object in specific position in the LinkedList used to print the enrolled student contents inside the Course class and return the name
	public E get(int position) {
		Node ref = list;
		Node re;
		for(int i =0 ; i < position;i++) {
			re = ref.getNext();
		}
		return null;
		
	}
	// Return number of elements in the list.
	public int size() {
		int size=0;
		while(list.getNext()!=null) {
			size++;
		}
		return size;
		
	}


}
