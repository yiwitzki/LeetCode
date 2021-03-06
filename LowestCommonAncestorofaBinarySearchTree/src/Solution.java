
public class Solution 
{
	private static TreeNode result;
	public static class TreeNode 
	{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
	{
		if (root == null || p == null || q == null)
			return null;
		if (p.val < root.val && q.val < root.val)
			result = lowestCommonAncestor(root.left, p, q);
		else if (p.val > root.val && q.val > root.val)
			result = lowestCommonAncestor(root.right, p, q);
		else
			return root;
		return result;
	}
	
	public static void main(String []args)
	{
		TreeNode root = new TreeNode(6);
		root.left = new TreeNode(2);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(0);
		System.out.print(lowestCommonAncestor(root,root.left.left,root.left).val);
	}
	
	        
}
