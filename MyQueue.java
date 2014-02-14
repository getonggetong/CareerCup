import java.util.Stack;

public class MyQueue{
	Stack<Integer> s1 = new Stack<Integer>();
	Stack<Integer> s2 = new Stack<Integer>();

	public void enqueue(int v){
		// for (int i = 0; i < s2.size(); i++){
		// 	s1.push(s2.pop());
		// 	System.out.println("-----");
		// }
		while(s2.size() != 0){
			s1.push(s2.pop());
		}
		s1.push(v);
		// System.out.println(s1.peek());
	}

	public int dequeue(){
		int v = 0;

		// 不能用for loop！因为s1的size会变！变了之后i还是像原来一样增长，就取不全了
		// for(int i = 0; i < s1.size(); i++){
			
		// 	s2.push(s1.pop());
		// 	System.out.println(s2.peek());
			
		// }

		while(s1.size() != 0){
			s2.push(s1.pop());
		}
		v = s2.pop();
		System.out.println("---");
		System.out.println(v);
		return v;
	}
}