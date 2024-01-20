package dsaAssignment1.main;
import dsaAssignment1.QueueDemo;


public class QueueDemoMain {

	public static void main(String[] args) {
	
		QueueDemo obj = new QueueDemo(5);
		
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		
		System.out.println("All elements in the queue are :- ");
		obj.displayQueue();
		
		System.out.println("\nResult of dequeue operation : " + 
		obj.dequeue());
		obj.displayQueue();
		
	
		
		System.out.println("\nResult of dequeue operation : " + 
		obj.dequeue());
		obj.displayQueue();
		
		System.out.println("\nResult of dequeue operation : " + 
		obj.dequeue());
		obj.displayQueue();
				
	
		System.out.println("total elements in the queue : " + 
		obj.count());
		
		System.out.println("result of peek() : " + obj.peek());	
		
		obj.enqueue(90);
		obj.displayQueue();
		
		System.out.println("\nResult of dequeue operation : " + 
		obj.dequeue());
		obj.displayQueue();
		
		System.out.println("\nResult of dequeue operation : " + 
		obj.dequeue());
		obj.displayQueue();
		
		System.out.println("\nResult of dequeue operation : " + 
		obj.dequeue());
		obj.displayQueue();
		
		
		
		System.out.println("Now , result of peek() : " + obj.peek());
	}
}

