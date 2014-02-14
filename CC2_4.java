public class CC2_4 {
	public static void main(String[] args){
		Node n1 = new Node(3);
		Node n2 = new Node(1);
		Node n3 = new Node(5);
		n1.next = n2;
		n2.next = n3;
		Node m1 = new Node(5);
		Node m2 = new Node(9);
		Node m3 = new Node(2);
		m1.next = m2;
		m2.next = m3;
		Node result = sum(n1, m1);
		while (result != null){
			System.out.println(result.value);
			result = result.next;
		}
		

	}
	public static Node sum(Node h1, Node h2){
		Node head;
		Node nextSum = new Node(0);
		int carry = 0;
		int lastCarry = 0;
		Node sum = new Node(0);
		Node tmp1 = h1;
		Node tmp2 = h2;
		Boolean h1Long = false;
		while (tmp1 != null && tmp2 != null){
			tmp1 = tmp1.next;
			tmp2 = tmp2.next;
		}
		if (tmp1 != null){
			h1Long = true;
			head = h1;
		}
		else{
			h1Long = false;
			head = h2;
		}
		while (h1 != null || h2 != null){
			int tmpSum = 0;
			if(h1Long){
				nextSum = h1;
			}
			else{
				nextSum = h2;
			}
			if(h1 != null && h2 != null){
				tmpSum = h1.value + h2.value;
			}
			else if (h1Long) {
				tmpSum = h1.value + 0;
			}
			else if (!h1Long) {
				tmpSum = h2.value + 0;
			}
			
			if(tmpSum > 9) {
				tmpSum = tmpSum - 10;
				carry = 1;
			}
			else 
				carry = 0;
			nextSum.value = tmpSum + lastCarry;
			if (h1 != null)
				h1 = h1.next;
			if (h2 != null)
				h2 = h2.next;
			lastCarry = carry;
		}
		if (carry == 1){
			Node msb = new Node(1);
			nextSum.next = msb;
		}
		return head;
	}
	
}