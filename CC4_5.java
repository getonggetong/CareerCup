



public class CC4_5{

	public static void main(String[] args){
		TreeNodeWithParent n0 = new TreeNodeWithParent(0);
		TreeNodeWithParent n1 = new TreeNodeWithParent(1);
		TreeNodeWithParent n2 = new TreeNodeWithParent(2);
		TreeNodeWithParent n3 = new TreeNodeWithParent(3);
		TreeNodeWithParent n4 = new TreeNodeWithParent(4);
		TreeNodeWithParent n5 = new TreeNodeWithParent(5);
		TreeNodeWithParent n6 = new TreeNodeWithParent(6);
		TreeNodeWithParent n7 = new TreeNodeWithParent(7);
		TreeNodeWithParent n8 = new TreeNodeWithParent(8);

		
		n3.left = n1;
		n3.right = n7;
		n1.parent = n3;
		n7.parent = n3;
		n1.left = n0;
		n1.right = n2;
		n0.parent = n1;
		n2.parent = n1;
		n7.left = n6;
		n6.parent = n7;
		n6.left = n5;
		n5.parent = n6;
		n7.right = n8;
		n8.parent = n7;

		System.out.println("n0: "+findNext(n0).value);
		System.out.println("n1: "+findNext(n1).value);
		System.out.println("n2: "+findNext(n2).value);
		System.out.println("n3: "+findNext(n3).value);
		// System.out.println("n4: "+findNext(n4).value);
		System.out.println("n5: "+findNext(n5).value);
		System.out.println("n6: "+findNext(n6).value);
		System.out.println("n7: "+findNext(n7).value);
		System.out.println("n8: "+findNext(n8).value);




	}

	public static TreeNodeWithParent findNext(TreeNodeWithParent node){
		if(node.right != null){
			TreeNodeWithParent next = node.right;
			while(next.left != null)
				next = next.left;
			return next;
		}
		else if(node.parent != null && node.parent.left == node)
			return node.parent;
		//少想了一种情况！当前节点右子树为空，但父亲的父亲不为空，所以当前节点的next是父节点的父节点
		else if(node.parent != null && node.parent.right == node && node.parent.parent != null && node.parent.parent.left == node.parent)
			return node.parent.parent;
		else 
			return node;

	}
}