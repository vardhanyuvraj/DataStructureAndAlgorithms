package SinglyLinkedList;

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
	public boolean isListEmpty() {
		if (getListLength() == 0 && head == null) {
			return true;
		}
		return false;
	}

	// This method inserts a new node at the beginning of the linked list
	public void insertAtBegin(int data) {
		SinglyNode newNode = new SinglyNode();
		if (isListEmpty()) {
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
		if (isListEmpty()) {
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
		if (isListEmpty()) {
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

	// This method deletes a node at a given position in the linked list
	public void deleteANode(int position) {
		if (position < 0 || position >= getListLength()) {
			System.out.println("Invalid Position Entered");
			return;
		} else {
			if (getListLength() == 0) {
				return;
			}
			if (position == 0) {
				SinglyNode currentNode = head;
				head = currentNode.getNext();
				currentNode.setNext(null);
				length--;
				return;
			} else {
				SinglyNode currentNode = head;
				for (int i = 1; i < position; i++) {
					currentNode = currentNode.getNext();
				}
				currentNode.setNext(currentNode.getNext().getNext());
				length--;
			}
		}
	}

	// This method inserts a new node at the specified position in the linked list
	public void insertAtPosition(int position, int data) {
		if (position < 0 || position > getListLength()) {
			System.out.println("Invalid Input");
		} else {
			if (position == 0) {
				insertAtBegin(data);
			} else if (position == getListLength() - 1) {
				insertAtEnd(data);
			} else {
				SinglyNode newNode = new SinglyNode();
				SinglyNode currentNode = head;
				for (int i = 0; i < position - 1; i++) {
					currentNode = currentNode.getNext();
				}
				newNode.setData(data);
				newNode.setNext(currentNode.getNext());
				currentNode.setNext(newNode);
				length++;
			}
		}
	}
}
