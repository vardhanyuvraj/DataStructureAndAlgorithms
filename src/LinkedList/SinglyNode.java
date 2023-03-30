package LinkedList;

//This class represents a node in a singly linked list
public class SinglyNode {

	// This variable stores the data associated with the node
	private int data;

	// This variable stores a reference to the next node in the linked list
	private SinglyNode next;

	// This is the default constructor for the class
	public SinglyNode() {
	}

	// This method returns the data associated with the node
	public int getData() {
		return data;
	}

	// This method sets the data associated with the node
	public void setData(int data) {
		this.data = data;
	}

	// This method returns the next node in the linked list
	public SinglyNode getNext() {
		return next;
	}

	// This method sets the next node in the linked list
	public void setNext(SinglyNode next) {
		this.next = next;
	}
}
