class StackException extends RuntimeException{    
		public StackException(String err) {
			super(err);
		}
}

public class Stack {
	
	private class Node{
		int element;
		Node next;
		
		public Node(int e, Node n){
			element = e;
			next = n;
		}
		
		public int getValue() {
			return element;
		}
		
		public Node getNext() {
			return next;
		}
	}
	
	// this is a reference to the head node of the linked list
	private Node top;
	
	// keep track of the number of elements in the stack
	private int size;
	
	public Stack(){
		top = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public int size(){
		return size; 
	}
	
	// part 3: complete
	/** Adds a new element to the stack
	 * 
	 * @param o the integer to add to the top of the stack
	 */
	public void push(int o){
		
		if(top == null)
		{
			top = new Node(o, null);
		}
		else
		{
			Node newLowerNode = top;
			top = new Node(o,newLowerNode);
		}
		
		size++;

	}
	
	// part 3: complete
	/** Removes an element from the top of the stack
	 * 
	 * @return the integer that was at the top of the stack
	 * @throws StackException if the stack is empty
	 */
	public int pop() throws StackException{
		
		if(isEmpty())
		{
			throw new StackException("Stack is empty.");
		}
		else
		{
			size--;
			int oldTopValue = top.getValue();
			top = top.getNext();
			return oldTopValue;
		}
		
	}
	
	// part 3: complete
	/** Returns the integer at the top of the stack
	 * 
	 * @return the integer at the top of the stack
	 * @throws StackException is the stack is empty
	 */
	public int top() throws StackException{
		
		if(isEmpty())
		{
			throw new StackException("Stack is empty.");
		}
		else
		{
			return top.getValue();
		}
	}
	
	
	

}
