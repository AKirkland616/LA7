package LA7.edu.wmich.cs1120;

public class Node<E> implements INode {
	E value;
	Node<E> nextN;
	
	public Node(E dataValue){// Constructor
		value = dataValue;
		nextN = null;
	}
	
	public Node(E dataValue, Node<E> nextNode){// Constructor
		value = dataValue;
		nextN = nextNode;
	}


	@Override
	public E getData() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public Node getNext(){
		// TODO Auto-generated method stub
		return nextN;
	}

	@Override
	public void setNext(Node next) {
		// TODO Auto-generated method stub
		nextN = next;
	}

}
