package queue;

import java.util.ArrayList;

public class Queue {
	
	private ArrayList<Object> queue=new ArrayList<>();

	public Queue() {
		super();
	}
	
	/**
	 * Add object to the queue
	 * @param o
	 */
	public void enqueue(Object o){
		
		queue.add(o);
		System.out.println("Object added "+o);
	}

	/**
	 * remove object from the queue. 
	 * remove only if element is there is queue.
	 */
	public void dequeue(){
		
		//check the size of the queue before removing element from queue
		if(queue.size()>0){
			System.out.println("Element removed "+queue.get(0));
			queue.remove(0);
		}
		else{
			System.out.println("Queue is empty");
		}
	}
}
