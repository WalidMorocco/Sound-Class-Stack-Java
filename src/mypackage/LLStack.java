package mypackage;

public class LLStack {
	private java.util.LinkedList<Sound> list = new java.util.LinkedList<Sound>();
	
	public LLStack() {

	}
	
	public void clear() {
		list.clear();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public Sound topEl() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return list.getLast();
	}
	
	public Sound pop() {
		if (isEmpty()) {
			throw new java.util.EmptyStackException();
		}
		return list.removeLast();
	}
	
	public void push(Sound el) {
		list.addLast(el);
	}
	
	public String toString() {
		return list.toString();
	}
}
