package LinkedList;

public class SinglyLinkedList {

	private Node head;
	private int length;

	public SinglyLinkedList() {
		length = 0;
	}

	public Node getHead() {
		return head;
	}

	public void insertAtBegin(int data) {
		Node newNode = new Node(data);
		if (length == 0) {
			head = newNode;
			length++;
		} else {
			newNode.setNext(head);
			head = newNode;
			length++;
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return displayList();
	}

	public String displayList() {
		String result = "[";
		if (length == 0) {
			result = result + "]";
		} else {
			Node currentNode = head;
			while (currentNode.getNext() != null) {
				result = result + currentNode.getData() + ", ";
				currentNode = currentNode.getNext();
			}
			result = result + currentNode.getData() + "]";
		}
		return result;
	}
}
