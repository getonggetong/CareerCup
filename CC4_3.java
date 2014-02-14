import java.util.ArrayList;

public class CC4_3{

	ArrayList<Integer> visited = new ArrayList<Integer>();
	public static void main(String[] args){

		CC4_3 cc = new CC4_3();
		int[] sorted = {0, 1, 2, 3};
		TreeNode root = cc.creatTree(sorted, 0, 3);
		System.out.println(root.value);
		System.out.println(root.left.value);
		System.out.println(root.right.value);
		// System.out.println(root.left.left.value);
		// System.out.println(root.left.right.value);
		// System.out.println(root.right.left.value);
		System.out.println(root.right.right.value);





	}

	public TreeNode creatTree(int[] array, int start, int end){

		
		// if(start == end){
		// 	TreeNode node = new TreeNode(array[(int)((start + end) / 2)]);
		// 	if(visited.indexOf((int)((start + end) / 2)) < 0){
		// 		System.out.println("start == end: " + node.value);
		// 		visited.add((int)((start + end) / 2));
		// 		return node;
		// 	}
		// 	else
		// 		return null;
		// }
		
		TreeNode node = new TreeNode(array[(int)((start + end) / 2)]);
		if(visited.indexOf((int)((start + end) / 2)) < 0){
				System.out.println("TreeNode node: " + node.value);
				visited.add((int)((start + end) / 2));
			}
			else
				return null;

		TreeNode n1 = this.creatTree(array, start, (start + end) / 2);
		TreeNode n2 = this.creatTree(array, (start + end) / 2 + 1, end);
		if(n1 != null){
			node.left = n1;
			System.out.println("n1: " + n1.value);

		}
		if(n2 != null){
			node.right = n2;
			System.out.println("n2: " + n2.value);

		}
		

		return node;
	}
}