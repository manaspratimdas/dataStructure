package stack;

public class MyStack {

	public static void main(String[] args) {
	
		
		Stack stack=new Stack();
		
		stack.peek();
		stack.push("A");
		stack.push("B");
		stack.push("C");		
		stack.peek();		
		stack.pop();		
		stack.peek();		
		stack.push("D");		
		stack.peek();		
		stack.pop();
		stack.pop();
		stack.pop();		
		stack.peek();
		
	}
	


}
