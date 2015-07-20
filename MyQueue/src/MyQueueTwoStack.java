import java.util.Stack;

public class MyQueueTwoStack 
{
	private Stack<Integer> instack = new Stack<Integer>();
	private Stack<Integer> outstack = new Stack<Integer>();

	// Push element x to the back of queue.
	public void push(int x) {
		instack.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		if (outstack.isEmpty())
			while (!instack.isEmpty())
				outstack.push(instack.pop());
		outstack.pop();
	}

	// Get the front element.
	public int peek() {
		if (outstack.isEmpty())
			while (!instack.isEmpty())
				outstack.push(instack.pop());
		return outstack.peek();
	}

	// Return whether the queue is empty.
	public boolean empty() {
		if (instack.isEmpty() && outstack.isEmpty())
			return true;
		else
			return false;
	}
}
