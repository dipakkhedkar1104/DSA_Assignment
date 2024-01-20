package dsaAssignment2.main;
import dsaAssignment2.circularQueueDemo;


public class circularQueueDemoMain {

	public static void main(String[] args) {
		
		circularQueueDemo a1=new circularQueueDemo(5);
				
				a1.enqueue(10);
				a1.enqueue(25);
				a1.enqueue(38);
				a1.enqueue(45);
				a1.enqueue(60);
				a1.traverseQueue();
				
				a1.enqueue(70);
				
				a1.dequeue();
				a1.dequeue();
				a1.traverseQueue();
				
				a1.enqueue(90);			
				a1.traverseQueue();

			}


	}

