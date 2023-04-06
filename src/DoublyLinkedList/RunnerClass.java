package DoublyLinkedList;

public class RunnerClass {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		System.out.println(doublyLinkedList.getListLength());
		doublyLinkedList.insertAtEnd(9);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList.displayList());
		doublyLinkedList.insertAtEnd(26);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList.displayList());
		doublyLinkedList.insertAtEnd(84);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList.displayList());
	}
}
