package Stack.UsingDynamicArray;

public class RunnerClass {

	public static void main(String[] args) {
		DynamicArrayStack dynamicArrayStack = new DynamicArrayStack();
		dynamicArrayStack.peek();
		System.out.println(dynamicArrayStack.isStackEmpty());
		System.out.println(dynamicArrayStack.printStack());
		dynamicArrayStack.push(13);
		dynamicArrayStack.peek();
		System.out.println(dynamicArrayStack.printStack());
		System.out.println(dynamicArrayStack.isStackEmpty());
		dynamicArrayStack.push(76);
		dynamicArrayStack.peek();
		System.out.println(dynamicArrayStack.printStack());
		dynamicArrayStack.push(54);
		dynamicArrayStack.peek();
		System.out.println(dynamicArrayStack.printStack());
		dynamicArrayStack.push(647);
		dynamicArrayStack.peek();
		System.out.println(dynamicArrayStack.printStack());
		dynamicArrayStack.pop();
		dynamicArrayStack.peek();
		System.out.println(dynamicArrayStack.printStack());
	}

}
