package DoublyLinkedList;

public class RunnerClass {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		System.out.println(doublyLinkedList.getListLength());
		doublyLinkedList.insertAtEnd(9);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteAtPosition(0);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertAtEnd(26);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertAtEnd(84);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertAtStart(781);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertAtEnd(1005);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.insertAtStart(111);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteAtPosition(2);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteAtPosition(0);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
		doublyLinkedList.deleteAtPosition(doublyLinkedList.getListLength() - 1);
		System.out.println(doublyLinkedList.getListLength());
		System.out.println(doublyLinkedList);
	}
}
