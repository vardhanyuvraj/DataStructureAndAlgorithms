package Stack.UsingLinkedList;

public class RunnerClass {

	public static void main(String[] args) {
		StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
		System.out.println(stackUsingLinkedList.displayStack());
		System.out.println(stackUsingLinkedList.peek());
		stackUsingLinkedList.push(10);
		System.out.println(stackUsingLinkedList.displayStack());
		System.out.println(stackUsingLinkedList.peek());
		stackUsingLinkedList.push(101);
		System.out.println(stackUsingLinkedList.displayStack());
		System.out.println(stackUsingLinkedList.peek());
		stackUsingLinkedList.push(21);
		System.out.println(stackUsingLinkedList.displayStack());
		System.out.println(stackUsingLinkedList.peek());
		stackUsingLinkedList.pop();
		System.out.println(stackUsingLinkedList.displayStack());
		System.out.println(stackUsingLinkedList.peek());
		stackUsingLinkedList.push(567);
		System.out.println(stackUsingLinkedList.displayStack());
		System.out.println(stackUsingLinkedList.peek());
	}

}
