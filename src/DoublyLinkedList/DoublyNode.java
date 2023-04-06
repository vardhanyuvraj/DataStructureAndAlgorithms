package DoublyLinkedList;

public class DoublyNode {

	// Pointer to the previous node in the list
	private DoublyNode prev;

	// Data stored in the node
	private int data;

	// Pointer to the next node in the list
	private DoublyNode next;

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}

}
