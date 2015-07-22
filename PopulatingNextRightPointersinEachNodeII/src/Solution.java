import java.util.Stack;

public class Solution 
{
	public static class TreeLinkNode 
	{
		int val;
		TreeLinkNode left, right, next;
		TreeLinkNode(int x) 
		{
			val = x;
		}
	}

	public static void connect(TreeLinkNode root) 
	{
		if (root == null)
			return ;
		Stack<TreeLinkNode> node_stack = new Stack<TreeLinkNode>();
		node_stack.push(root);
		while (!node_stack.isEmpty())
		{
			TreeLinkNode node = node_stack.pop();
			System.out.print("\n" + node.val);
			if ((node.left != null && node.left.next == null) || (node.right != null && node.right.next == null))
			{
				if (node.left !=null && node.right != null)
					node.left.next = node.right;
				if (node.next != null)
				{
					TreeLinkNode left = null, right = null;
					left = node.right != null ? node.right : node.left;
					for (TreeLinkNode p = node.next; p != null; p = p.next)
					{
						if (p.left != null)
						{
							right = p.left;
							break;
						}
						if (p.right != null)
						{
							right = p.right;
							break;
						}
					}
					if (left != null)
					{
						left.next = right;
					}
				}
				if (node.left != null)
					node_stack.push(node.left);
				if (node.right != null)
					node_stack.push(node.right);
				
			}
		}
	}
	
	public static void connect1(TreeLinkNode root)
	{
		if (root == null)
			return ;
		if (root.left !=null && root.right != null)
			root.left.next = root.right;
		if (root.next != null)
		{
			TreeLinkNode left = null, right = null;
			left = root.right != null ? root.right : root.left;
			for (TreeLinkNode p = root.next; p != null; p = p.next)
			{
				if (p.left != null)
				{
					right = p.left;
					break;
				}
				if (p.right != null)
				{
					right = p.right;
					break;
				}
			}
			if (left != null)
			{
				left.next = right;
			}
		}
		connect1(root.right);
		connect1(root.left);
	}
	
	static void printTree(TreeLinkNode root){
	    if (root == null){
	        return;
	    }
	    System.out.printf("[%2d] : left[%d], right[%d], next[%d]\n",
	            root.val,
	            root.left != null ? root.left.val : -1,
	            root.right != null ? root.right.val : -1,
	            root.next != null ? root.next.val : -1 );

	    printTree(root.left);
	    printTree(root.right);

	}
	public static void main(String []args)
	{
		TreeLinkNode root = new TreeLinkNode(0);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(4);
		root.left.left = new TreeLinkNode(1);
		root.right.right = new TreeLinkNode(10);
		root.right.left = new TreeLinkNode(3);
		root.left.left.left = new TreeLinkNode(5);
		root.left.left.right = new TreeLinkNode(1);
		root.right.left.right = new TreeLinkNode(6);
		root.right.right.right = new TreeLinkNode(8);
		connect1(root);
		printTree(root);
	}
}
