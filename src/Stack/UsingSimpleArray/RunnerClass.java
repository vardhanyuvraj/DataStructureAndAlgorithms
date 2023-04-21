package Stack.UsingSimpleArray;

public class RunnerClass {

	public static void main(String[] args) {
		SimpleArrayStack stack = new SimpleArrayStack(10);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(5);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(4);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(495);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(5);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(4);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(495);
		System.out.println(stack.printStack());
		stack.peek();
		stack.pop();
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(5);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(4);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(495);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(5);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(4);
		System.out.println(stack.printStack());
		stack.peek();
		stack.push(495);
		System.out.println(stack.printStack());
		stack.peek();
		stack.pop();
		System.out.println(stack.printStack());
		stack.peek();
	}

}
