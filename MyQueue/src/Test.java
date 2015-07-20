
public class Test 
{
	public static void main(String []args)
	{
		MyQueueOneStack queue = new MyQueueOneStack();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.pop();
		System.out.print(queue.peek());
		queue.push(3);
		queue.push(4);
		System.out.print(queue.peek());
		queue.pop();
		System.out.print(queue.peek());
	}
}
