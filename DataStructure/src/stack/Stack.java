package stack;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Object> stack = new ArrayList<>();

	public Stack() {
		super();
	}

	public Stack(ArrayList<Object> stack) {
		super();
		this.stack = stack;
	}

	/**
	 * The method that add element to the top of the stack
	 * 
	 * @param o
	 */
	public void push(Object o) {
		stack.add(o);
		System.out.println("element added " + o);
	}

	/**
	 * method that remove the element from top of stack
	 */
	public void pop() {

		System.out.println("stack size " + stack.size());
		// Ensure that we try to remove element from stack only when there is element in stack
		// This condition is necessary to avoid null pointer exception
		if (stack.size() > 0) {
			System.out.println("element removed " + stack.get(stack.size() - 1));
			stack.remove(stack.size() - 1);

		} else {
			System.out.println("stack is empty");
		}
	}

	/**
	 * Method to check the topmost element of the stack
	 * 
	 * @return
	 */
	public Object peek() {
		Object o = null;
		// Ensure that we try to access element from stack only when there is element in stack 
		// This condition is necessary to avoid null pointer exception
		if (stack.size() > 0) {

			o = stack.get(stack.size() - 1);
			System.out.println("element at top " + o);

		} else {
			System.out.println("stack is empty");
		}

		return o;

	}

}
