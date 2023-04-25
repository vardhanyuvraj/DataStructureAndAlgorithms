/**
 * The SimpleArrayStack class represents a simple implementation of the Stack data structure
 * using a simple array.
 */
package Stack.UsingSimpleArray;

public class SimpleArrayStack {

	// Represents the top index of the stack, initialized to -1
	private int top = -1;

	// Represents the stack array
	private int stack[];

	// Constructs a SimpleArrayStack object with the specified length.
	public SimpleArrayStack(int length) {
		stack = new int[length];
	}

	// Checks if the stack is empty.
	public boolean isStackEmpty() {
		if (top == -1) {
			return true;
		} else
			return false;
	}

	// Checks if the stack is full.
	public boolean isStackFull() {
		if (top == stack.length - 1) {
			return true;
		} else
			return false;
	}

	// Returns the top element of the stack without removing it.
	public void peek() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Top Element is " + stack[top]);
	}

	// Returns a string representation of the stack.
	public String printStack() {
		String result = "[ ";
		if (isStackEmpty()) {
			result = result + "Stack Underflow ]";
			return result;
		} else {
			for (int i = 0; i <= top; i++) {
				result = result + stack[i] + " ";
			}
		}
		return result + "]";
	}

	// Adds an element to the top of the stack.
	public void push(int data) {
		if (isStackFull()) {
			System.out.println("Stack Overflow");
			return;
		} else {
			stack[++top] = data;
		}
	}

	// Removes the top element from the stack.
	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
			return;
		} else {
			top--;
		}
	}

}
