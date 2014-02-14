public class CC3_5{
	public static void main(String[] args){
		MyQueue mq = new MyQueue();
		mq.enqueue(1);
		// System.out.println(mq.dequeue() + "\n");
		mq.enqueue(2);
		mq.dequeue();
		
		
		// System.out.println(mq.dequeue() + "\n");
		mq.enqueue(3);
		mq.dequeue();
		// System.out.println(mq.dequeue() + "\n");
		mq.enqueue(4);

		mq.dequeue();
		mq.dequeue();
		
		
		
		// System.out.println(mq.dequeue() + "\n");

	}

}