import java.util.ArrayList;
import java.util.Stack;

public class SetOfStacks{
	ArrayList<Stack> stackList = new ArrayList<Stack>();
	Stack<Integer> stack;
	int limit;

	public SetOfStacks(int limit){
		this.limit = limit;
	}
	public void push(int v){
		if(stackList.size() == 0){
			stack = new Stack<Integer>();
			stack.push(v);
			stackList.add(stack);
		}
		else{
			stack =  stackList.get(stackList.size()-1);
			if(stack.size() == limit){
				stack = new Stack<Integer>();
				stack.push(v);
				stackList.add(stack);
			}
			else{
				stack.push(v);
				stackList.set(stackList.size()-1, stack);
			}
			
		}
		System.out.println("size of current stack is: " + stack.size());
		System.out.println("size of the stackList is: " + stackList.size() + "\n");

	}
	public int pop(){
		int v = 0;
		if (stackList.size() > 0){
			stack = stackList.get(stackList.size()-1);
		v = stack.pop();
		if(stack.size() > 0)
			stackList.set(stackList.size() - 1, stack);
		else
			stackList.remove(stackList.size() - 1);
		}
		System.out.println("pop "+ v);
		System.out.println("size of current stack is: " + stack.size());
		System.out.println("size of the stackList is: " + stackList.size() + "\n");

		return v;
	}
}