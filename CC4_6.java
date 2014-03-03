public class CC4_6{
	public static void main(String[] args){
		TreeNode root = new TreeNode(0);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);



		TreeNode anc;
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n4.left = n5;

		anc = findAncestor(n3, n5, root);
		if(anc != null)
			System.out.println(anc.value);
	}

	public static TreeNode findAncestor(TreeNode n1, TreeNode n2, TreeNode root){
		TreeNode ancestor;

		//forgot base condition!
		// if((root.left == n1 && root.right == n2) || (root.left == n2 && root.right == n1))
		// 	return root;
		// else if((inSubTree(n1, root.left) && inSubTree(n1, root.right)) ||(inSubTree(n2, root.left) && inSubTree(n1, root.right)))
		// 	return root;

		//above base condition is not inclusive! 
		//this one is inclusive
		if(((root.left == n1 || inSubTree(n1, root.left)) && (root.right == n2) || inSubTree(n2, root.right))
			|| ((root.left == n2 || inSubTree(n2, root.left)) && (root.right == n1) || inSubTree(n1, root.right)))
			return root;
		
		else if(inSubTree(n1, root.left) && inSubTree(n2, root.left)){
			ancestor = findAncestor(n1, n2, root.left);
			return ancestor;
		}
		else if(inSubTree(n1, root.right) && inSubTree(n2, root.right)){
			ancestor = findAncestor(n1, n2, root.right);
			return ancestor;
		}
		else
			return null;
	}

	public static boolean inSubTree(TreeNode node, TreeNode root){
		boolean isSub = false;
		if(root == null)
			return false;
		if(root == node)
			return true;
		if(root.left != null)
			isSub = inSubTree(node, root.left);
		if(isSub)
			return true;
		if(root.right != null)
			isSub = inSubTree(node, root.right);
		if(isSub)
			return true;

		return isSub;
	}
}