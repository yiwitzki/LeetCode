package traverseinorder;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traverseinorder 
{
	private boolean mark = false;
	private Queue<Integer> queue = new LinkedList();
	public class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) 
		{ 
			val = x; 
		}
	}
	
	  public class TreeLinkNode {
	      int val;
	      TreeLinkNode left, right, next;
	      TreeLinkNode(int x) { val = x; }
	  }
	
	public void connect(TreeLinkNode root) 
    {
		if (root == null)
            return;
         Stack<TreeLinkNode> node_stack = new Stack<TreeLinkNode>();
         node_stack.push(root);
         while (!node_stack.isEmpty())
         {
           if (root.left != null && root.left.next == null)
           {
               root.left.next = root.right;
               if (root.next != null)
               {
                   root.right.next = root.next.left;
               }
               node_stack.push(root.right);
               node_stack.push(root.left);
           }
           root = node_stack.pop();
         }
    }
	
	public Traverseinorder()
	{
		TreeLinkNode root = new TreeLinkNode(0);
		root.left = new TreeLinkNode(1);
		/*root.left.left = new TreeNode(2);
		root.left.left.left = new TreeNode(2);*/
		root.right = new TreeLinkNode(2);
		//queue = preorderTraversal(root);
		connect(root);
	}
	
	public Queue<Integer> inorderTraversal(TreeNode root) 
    {
        Stack<TreeNode> node_stack = new Stack<TreeNode>();
        LinkedList<Integer> node_list = new LinkedList<Integer>();
        while (!node_stack.isEmpty() || root != null)
        {
        	if (root != null)
        	{
        		node_stack.push(root);
        		root = root.left;
        	}
        	else
        	{
        		if (!node_stack.isEmpty())
        		{
        			root = node_stack.pop();
        			node_list.add(root.val);
        			root = root.right;
        		}
        		
        	}
        	
        	
        }    
        	return node_list;
        	
    }
	public Queue<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> node_stack = new Stack<TreeNode>();
        LinkedList<Integer> node_list = new LinkedList<Integer>();
         while (!node_stack.isEmpty() || root != null)
         {
             if (root != null)
             {
                 node_list.add(root.val);
                 node_stack.push(root);
                 root = root.left;
             }
             else
             {
                 if (!node_stack.isEmpty())
        		 {
        			root = node_stack.pop();
        			
        			root = root.right;
        			    //node_list.add(root.val);
        			
        			    
        			
        		 }
             }
                
         }
         return node_list;
    }
	public void print()
	{
		for (Iterator<Integer> iter = queue.iterator(); iter.hasNext();)
		{
			System.out.print(iter.next() + "\n");
		}
	}
	
	public static void main(String []args)
	{
		Traverseinorder ti = new Traverseinorder();
		ti.print();
	}
}
