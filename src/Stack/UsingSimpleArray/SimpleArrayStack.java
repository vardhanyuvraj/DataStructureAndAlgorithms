package Stack.UsingSimpleArray;

public class SimpleArrayStack {

	private int top = -1;
	private int stack[];

	public SimpleArrayStack(int length) {
		stack = new int[length];
	}

	public boolean isStackEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	public boolean isStackFull() {
		if (top == stack.length - 1) {
			return true;
		} else
			return false;
	}

	public void getTopElement() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println(stack[top]);
	}

	public void push(int data) {
		if (isStackFull()) {
			System.out.println("Stack Overflow");
			return;
		} else {
			stack[++top] = data;
		}
	}

	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
			return;
		} else {
			stack[top--] = -9999;
		}
	}

}
