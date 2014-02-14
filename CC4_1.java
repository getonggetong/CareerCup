public class CC4_1{

	int max = -1;
	int min = 32767;
	static CC4_1 cc = new CC4_1();
	public static void main(String[] args){
		
		TreeNode root = new TreeNode(0);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);

		root.left = n1;
		n1.left = n2;
		n2.left = n3;
		root.right = n4;

		if(cc.checkBalance(root))
			System.out.println("balance");
		else
			System.out.println("not balance");
	}

	public boolean checkBalance(TreeNode root){
		
		cc.dfs(root, 0);
		if(max - min > 1)
			return false;
		else
			return true;
	}

	public int dfs(TreeNode node, int deep){
		int d = deep;

		if(node.left == null && node.right == null){
			if(d > max)
				max = d;
			if(d < min)
				min = d;
		}
		else{
			d++;
			if(node.left != null){
				cc.dfs(node.left, d);
			}
			if(node.right != null){
				cc.dfs(node.right, d);
			}
		}

		return d;
	}
}