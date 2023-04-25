package Stack.UsingLinkedList;

public class StackUsingLinkedList {

	private LinkedListNode head;

	private LinkedListNode top;

	public StackUsingLinkedList() {
	}

	public int peek() {
		if (isStackEmpty()) {
			return -1;
		}
		return top.getData();
	}

	public boolean isStackEmpty() {
		return head == null;
	}

	public String displayStack() {
		String result = "[";
		if (isStackEmpty()) {
			result = result + "]";
		} else {
			LinkedListNode currentNode = head;
			while (currentNode.getNext() != null) {
				result = result + currentNode.getData() + ", ";
				currentNode = currentNode.getNext();
			}
			result = result + currentNode.getData() + "]";
		}
		return result;
	}

	public void push(int data) {
		LinkedListNode newNode = new LinkedListNode();
		newNode.setData(data);
		if (isStackEmpty()) {
			head = newNode;
			top = head;
		} else {
			top.setNext(newNode);
			top = newNode;
		}
	}

	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack is empty.");
		} else {
			LinkedListNode currentNode = head;
			while (currentNode.getNext() != top) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(null);
			top = currentNode;
		}
	}
}
