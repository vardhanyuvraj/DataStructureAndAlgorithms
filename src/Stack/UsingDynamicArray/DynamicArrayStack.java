package Stack.UsingDynamicArray;

import java.util.ArrayList;

public class DynamicArrayStack {

	// Initializes the top index of the stack to -1
	private int top = -1;

	// Declares an ArrayList to store the stack
	private ArrayList<Integer> stack;

	// Constructor that initializes an empty DynamicArray
	public DynamicArrayStack() {
		stack = new ArrayList<>();
	}

	// Checks if the stack is empty
	public boolean isStackEmpty() {
		if (top == -1) {
			return true;
		} else {
			return false;
		}
	}

	// Returns the top element of the stack without removing it
	public void peek() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
			return;
		}
		System.out.println("Top Element is " + stack.get(top));
	}

	// Returns a string representation of the stack
	public String printStack() {
		String result = "[ ";
		if (isStackEmpty()) {
			result = result + "Stack Underflow ]";
			return result;
		} else {
			for (int i = 0; i <= top; i++) {
				result = result + stack.get(i) + " ";
			}
		}
		return result + "]";
	}

	// Adds an element to the top of the stack
	public void push(int data) {
		stack.add(data);
		top++;
	}

	// Removes the top element from the stack
	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack Underflow");
			return;
		} else {
			stack.remove(top);
			top--;
		}
	}

}
