import java.util.ArrayList;
import java.util.LinkedList;

public class CC4_4{
	public static void main(String[] args){
		ArrayList<LinkedList<TreeNode>> allList = new ArrayList<LinkedList<TreeNode>>();
		TreeNode root = new TreeNode(0);
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(4);
		TreeNode n5 = new TreeNode(5);
		TreeNode n6 = new TreeNode(6);

		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.left = n5;
		n2.right = n6;
		listPerLevel(root, allList, 0);
		System.out.println(allList);
	}
	public static void listPerLevel(TreeNode root, ArrayList<LinkedList<TreeNode>> allList, int level){
		LinkedList<TreeNode> ll;
		if(allList.size() == level){
			ll = new LinkedList<TreeNode>();
			ll.add(root);
			allList.add(ll);
		}
		else if (allList.get(level) != null){
			ll = allList.get(level);
			ll.add(root);
			allList.set(level, ll);
		}
		
		
		if(root.left != null)
			listPerLevel(root.left, allList, level+1);
		if(root.right != null)
			listPerLevel(root.right, allList, level+1);

	}
}