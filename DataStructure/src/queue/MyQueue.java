package queue;

public class MyQueue {

	public static void main(String[] args) {
		
		Queue queue=new Queue();
		
		queue.dequeue();
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		queue.dequeue();
		
		queue.enqueue("D");
		queue.enqueue("E");
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();

	}

}
