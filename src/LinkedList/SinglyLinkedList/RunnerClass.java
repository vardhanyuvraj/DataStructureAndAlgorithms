package LinkedList.SinglyLinkedList;

public class RunnerClass {

	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		System.out.println(singlyLinkedList.getListLength());
		System.out.println(singlyLinkedList.displayList());
		System.out.println(singlyLinkedList);
		singlyLinkedList.insertAtBegin(10);
		System.out.println(singlyLinkedList.getListLength());
		System.out.println(singlyLinkedList);
		singlyLinkedList.insertAtBegin(646);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtEnd(8558);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtBegin(71);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtEnd(987);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.deleteANode(1);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtBegin(4566);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtEnd(24);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.deleteANode(4);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.deleteANode(0);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.deleteANode(3);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtPosition(1, 54);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtPosition(0, 354);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
		singlyLinkedList.insertAtPosition(6, 1);
		System.out.println(singlyLinkedList);
		System.out.println(singlyLinkedList.getListLength());
	}

}
