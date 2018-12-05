package LA7.edu.wmich.cs1120;

public class Node<E> implements INode {
	E value;
	Node<E> nextN;
	/**
	 * 
	 * @param dataValue make a node with data value 
	 */
	public Node(E dataValue){// Constructor
		value = dataValue;
		nextN = null;
	}
	/**
	 * 
	 * @param dataValue make a node with a data value
	 * @param nextNode set the next node equal to the successor node
	 */
	public Node(E dataValue, Node<E> nextNode){// Constructor
		value = dataValue;
		nextN = nextNode;
	}

/**
 * @return the value of the node
 */
	@Override
	public E getData() {
		// TODO Auto-generated method stub
		return value;
	}
/**
 * @return return the next node
 */
	@Override
	public Node getNext(){
		// TODO Auto-generated method stub
		return nextN;
	}
/**
 * @param next make the next node equal to the next node in the list
 */
	@Override
	public void setNext(Node next) {
		// TODO Auto-generated method stub
		nextN = next;
	}

}
