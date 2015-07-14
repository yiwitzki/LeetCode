public class Solution 
{
	public static class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) 
		{
			val = x;
		}
	}

	public static TreeNode invertTree(TreeNode root) 
	{
		if (root == null)
			return root;
		invertTree(root.left);
		invertTree(root.right);
		if (root.left != null || root.right != null)
		{
			if (root.left != null)
			{
				TreeNode temp = root.left;
				root.left = root.right;
				root.right = temp;
			}
			else
			{
				TreeNode temp = root.right;
				root.right = root.left;
				root.left = temp;
			}
			
		}
		return root;
	}
	
	public static void main(String []args)
	{
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(5);
		//root.right = new TreeNode(6);
		invertTree(root);
		System.out.println(root.val);
		System.out.println(root.left.val);
		System.out.println(root.right.val);
	}
}
