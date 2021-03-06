import java.util.ArrayList;
import java.util.Stack;


public class MyQueueOneStack 
{
	private Stack<Integer> stack = new Stack<Integer>();
    // Push element x to the back of queue.
    public void push(int x) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int size = stack.size();
        for (int i = 0; i < size; i++)
        {
            list.add(stack.pop());
        }
        stack.push(x);
        for (int i = list.size() - 1; i >= 0; i--)
        {
            stack.push(list.get(i));
        }
    }

    // Removes the element from in front of queue.
    public void pop() 
    {
        stack.pop();
    }

    // Get the front element.
    public int peek() 
    {
        return stack.get(stack.size() - 1);
    }

    // Return whether the queue is empty.
    public boolean empty() 
    {
        if (stack.size() == 0)
            return true;
        else
            return false;
    }
}
