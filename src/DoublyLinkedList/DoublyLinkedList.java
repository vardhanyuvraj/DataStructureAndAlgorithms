package DoublyLinkedList;

public class DoublyLinkedList {

	// The head of the linked list
	private DoublyNode head;

	// The length of the linked list
	private int length;

	// Constructor
	public DoublyLinkedList() {

	}

	// Returns the length of the linked list
	public int getListLength() {
		return length;
	}

	// Checks if the linked list is empty
	public boolean isListEmpty() {
		// If the length is 0 and the head is null, the list is empty
		if (getListLength() == 0 && head == null) {
			return true;
		}
		return false;
	}

	// Displays the contents of the linked list as a string
	private String displayList() {
		String result = "[";
		if (isListEmpty()) {
			result = result + "]";
		} else {
			// Traverse the list and add each element to the result string
			DoublyNode currentNode = head;
			while (currentNode.getNext() != null) {
				result = result + currentNode.getData() + ", ";
				currentNode = currentNode.getNext();
			}
			result = result + currentNode.getData() + "]";
		}
		return result;
	}

	// Overrides the toString() method to display the linked list
	@Override
	public String toString() {
		return displayList();
	}

	// Inserts a new node with the given data at the end of the linked list
	public void insertAtEnd(int data) {
		DoublyNode newNode = new DoublyNode();
		newNode.setData(data);

		if (isListEmpty()) {
			// The list is empty, so the new node becomes the head node
			head = newNode;
		} else {
			// Traverse to the end of the list
			DoublyNode currentNode = head;
			while (currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			// Link the new node to the last node in the list
			currentNode.setNext(newNode);
			newNode.setPrev(currentNode);
		}
		length++;
	}

	// Inserts a new node with the given data at the start of the linked list
	public void insertAtStart(int data) {
		DoublyNode newNode = new DoublyNode();
		newNode.setData(data);
		newNode.setNext(head);
		head.setPrev(newNode);
		head = newNode;
		length++;
	}

	// This method deletes a node at a given position in the linked list
	public void deleteAtPosition(int position) {
		if (position < 0 || position >= getListLength()) {
			System.out.println("Invalid Input");
			return;
		}
		if (position == 0 && getListLength() == 1) {
			head = null;
			length--;
		} else if (position == 0 && isListEmpty() != true) {
			head = head.getNext();
			length--;
		} else {
			DoublyNode toDelete = head;
			for (int i = 0; i < position; i++) {
				toDelete = toDelete.getNext();
			}
			toDelete.getPrev().setNext(toDelete.getNext());
			toDelete = null;
			length--;
		}
	}

}
