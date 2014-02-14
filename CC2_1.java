// 并不是完全没有动原来的链表，而是往前挪它，用prev表示前一个node，当前node赋给前一个node，
// 当前node的next赋给当前node

public class CC2_1 {
	// LinkedList ll = new LinkedList();
	Node first = null;
	Node last = null;
	// int num = 0;
	public static void main(String[] args){
		Node head = new Node("hello");
		Node n1 = new Node("world");
		Node n2 = new Node("hello");
		head.next = n1;
		n1.next = n2;
		CC2_1 c = new CC2_1();
		c.rvDup(head);
	}
	public void rvDup(Node n){
		Node prev = n;
		
		while (n != null){
			Node cmp = n.next;
			while (cmp != null){
				if(cmp.value.equals(n.value)){
					prev.next = n.next;
					n = n.next;
					break;
				}
				cmp = cmp.next;
			}
			if (n != null)
				System.out.println(n.value+"\n");
			
			prev = n;
			n = n.next;
		}
	}
}

