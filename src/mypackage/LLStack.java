package mypackage;

public class LLStack {
	private java.util.LinkedList<Sound> list = new java.util.LinkedList<Sound>();
	
	// Constructor
	public LLStack() {

	}
	
	// Clear the Stack
	public void clear() {
		list.clear();
	}
	
	// Return if the Stack is empty or not
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	// Return the Object at the top of the Stack (Last Object)
	public Sound topEl() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return list.getLast();
	}
	
	// Remove the Object at the top of the Stack
	public Sound pop() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return list.removeLast();
	}
	
	// Add an Object to the Stack
	public void push(Sound el) {
		list.addLast(el);
	}

}
