package Stack.UsingSimpleArray;

public class RunnerClass {

	public static void main(String[] args) {
		SimpleArrayStack stack = new SimpleArrayStack(10);
		stack.getTopElement();
		stack.push(5);
		stack.getTopElement();
		stack.push(4);
		stack.getTopElement();
		stack.push(495);
		stack.getTopElement();
		stack.push(5);
		stack.getTopElement();
		stack.push(4);
		stack.getTopElement();
		stack.push(495);
		stack.getTopElement();
		stack.pop();
		stack.getTopElement();
		stack.push(5);
		stack.getTopElement();
		stack.push(4);
		stack.getTopElement();
		stack.push(495);
		stack.getTopElement();
		stack.push(5);
		stack.getTopElement();
		stack.push(4);
		stack.getTopElement();
		stack.push(495);
		stack.getTopElement();
	}

}
