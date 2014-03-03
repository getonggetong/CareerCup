public class CC4_7{
	public static void main(String[] args){
		TreeNode root1 = new TreeNode(0);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode root2 = new TreeNode(null);
		TreeNode m1 = new TreeNode(3);
		root1.left = n1;
		root1.right = n2;
		n1.left = n3;
		n1.right = n4;

		// root2.left = m1;

		if(hasRoot2(root1, root2))
			System.out.println("isSubTree");
		else{
			System.out.println("not SubTree");
		}
	}

	public static boolean hasRoot2(TreeNode root1, TreeNode root2){
		if(root1.value == root2.value){
			if(isSubTree(root1, root2)){
				return true;
			}
		}
		else{
			if(root1.left != null){
				if(hasRoot2(root1.left, root2)){
					return true;
				}
			}
			if(root1.right != null){
				if(hasRoot2(root1.right, root2)){
					return true;					
				}
			}
		}
		return false;
	}

	public static boolean isSubTree(TreeNode root1, TreeNode root2){
		if(root1.value == root2.value){
			if(root1.left == null && root2.left == null && root1.right == null && root2.right == null){
				return true;
			}
			if(root1.left != null && root2.left != null){
				if(isSubTree(root1.left, root2.left))
					return true;
				else 
					return false;
			}
			if(root1.right != null && root2.right != null){
				if(isSubTree(root1.right, root2.right))
					return true;
				else
					return false;
			}
		}
		return false;
	}
}