import java.util.Stack;

public class CC3_6{

	

	public static void main(String[] args){

		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> tmp = new Stack<Integer>();
		CC3_6 cc = new CC3_6();

		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(6);
		stack.push(7);
		stack.push(2);
		stack.push(10);
		stack.push(0);

		cc.sort(stack, tmp);

	}

	public void sort(Stack<Integer> stack, Stack<Integer> tmp){
		tmp.push(stack.pop());
		while(stack.size() > 0 && stack.peek() <= tmp.peek()){
			tmp.push(stack.pop());
		}
		if(stack.size() > 0 && stack.peek() > tmp.peek()){
			int v = stack.pop();
			while(tmp.size() > 0 && v > tmp.peek()){
				stack.push(tmp.pop());
			}
			tmp.push(v);
		}
		if(stack.size() > 0)
			sort(stack, tmp);
		else{
			while(tmp.size() > 0){
				stack.push(tmp.pop());
			}
		}
		while(stack.size() > 0)
			System.out.println(stack.pop());
	}
}