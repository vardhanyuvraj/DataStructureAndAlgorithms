package LinkedList;

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
	}

}
