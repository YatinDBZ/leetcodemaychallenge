public class CousinsInBinaryTree{
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public boolean isCousins(TreeNode root, int x, int y) {

		if(root==null)
		{
			return Boolean.FALSE;
		}

		if(shareSameParent(root, x, y))
		{
			return Boolean.FALSE;
		}
		if(!(getHeight(root, x,0)==getHeight(root, y,0)))
		{
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
	}


	public int getHeight(TreeNode root, int destNodeVal, int height )
	{
		if(root==null)
		{
			return 0;
		}
		if(root.val== destNodeVal)
		{
			return height;
		}


		int lheight = getHeight(root.left, destNodeVal,height+1);

		if(lheight!=0)
		{
			return lheight;
		}
		lheight = getHeight(root.right,destNodeVal,height+1);
		return lheight;
	}

	public boolean shareSameParent(TreeNode rootNode,int a,int b)
	{
		if(rootNode == null )
		{
			return Boolean.FALSE;
		}


		return ((rootNode.left!=null&&rootNode.right!=null&&rootNode.left.val ==a && rootNode.right.val==b)
				||(rootNode.left!=null&&rootNode.right!=null&&rootNode.left.val ==b && rootNode.right.val ==a)
				|| (shareSameParent(rootNode.left,a,b))
				|| (shareSameParent(rootNode.right,a,b))
				);
	}
}