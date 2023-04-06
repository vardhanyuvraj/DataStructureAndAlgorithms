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
	public String displayList() {
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
}
