public class CC2_2{
	public static void main(String[] args){
		Node n1 = new Node("a");
		Node n2 = new Node("b");
		Node n3 = new Node("c");
		Node n4 = new Node("d");
		Node n5 = new Node("e");
		Node n6 = new Node("f");
		Node n7 = new Node("g");
		Node n8 = new Node("h");
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = n8;
		Node result = afterN(n1, 20);
		while (result != null){
			System.out.println(result.value);
			result = result.next;
		}
		
	}
	public static Node afterN(Node head, int n){
		int count = 0;
		while (count < n - 1 && head.next != null){
			head = head.next;
			count++;
		}
		return head;
	}
}