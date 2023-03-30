package LinkedList;

//This class represents a singly linked list
public class SinglyLinkedList {

	// This variable stores a reference to the head node of the linked list
	private SinglyNode head;

	// This variable stores the length of the linked list
	private int length;

	// This is the default constructor for the class
	public SinglyLinkedList() {
	}

	// This method returns the length of the linked list
	public int getListLength() {
		return length;
	}

	// This method checks if the linked list is empty
	public boolean isEmpty() {
		if (getListLength() == 0 && head == null) {
			return true;
		}
		return false;
	}

	// This method inserts a new node at the beginning of the linked list
	public void insertAtBegin(int data) {
		SinglyNode newNode = new SinglyNode();
		if (isEmpty()) {
			newNode.setData(data);
			head = newNode;
			length++;
		} else {
			newNode.setData(data);
			newNode.setNext(head);
			head = newNode;
			length++;
		}
	}

	// This method returns a string representation of the linked list
	public String displayList() {
		String result = "[";
		if (isEmpty()) {
			result = result + "]";
		} else {
			SinglyNode currentNode = head;
			while (currentNode.getNext() != null) {
				result = result + currentNode.getData() + ", ";
				currentNode = currentNode.getNext();
			}
			result = result + currentNode.getData() + "]";
		}
		return result;
	}

	@Override
	public String toString() {
		return displayList();
	}

	// This method inserts a new node at the end of the linked list
	public void insertAtEnd(int data) {
		SinglyNode newNode = new SinglyNode();
		if (isEmpty()) {
			insertAtBegin(data);
		} else {
			SinglyNode currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			newNode.setData(data);
			currentNode.setNext(newNode);
			newNode.setNext(null);
			length++;
		}
	}
}
