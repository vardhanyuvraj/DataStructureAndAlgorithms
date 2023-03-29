package LinkedList;

public class SinglyLinkedList {

	private SinglyNode head;
	private int length;

	public SinglyLinkedList() {
	}

	public SinglyNode getHead() {
		return head;
	}

	public void insertAtBegin(int data) {
		SinglyNode newNode = new SinglyNode();
		if (length == 0 && getHead() == null) {
			newNode.setData(data);
			head = newNode;
			;
			length++;
		} else {
			newNode.setData(data);
			newNode.setNext(head);
			head = newNode;
			length++;
		}
	}

	public int getListLength() {
		return length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return displayList();
	}

	public String displayList() {
		String result = "[";
		if (length == 0 && getHead() == null) {
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
}
