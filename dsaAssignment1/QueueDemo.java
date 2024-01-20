/*5.
Write a Java class QueueDemo with methods for the following
functionalities.
* Determine whether a Queue is empty.
* Determine whether a Queue is full.
* En-queue an item to the Queue . Before en-queuing check whether
queue is full.
* De-queue an item from the queue . Before removing method must
check whether queue is empty
Use the above methods try the following from the main method
• Read 5 inputs from user and do enqueue operation
• Remove 3 elements from the queue and display.
• En-queue few more elements
• De-Queue aII the items from the queue and display */

package dsaAssignment1;

public class QueueDemo {

	private int[] arr;
	private int capacity;
	private int rear;
	
	public QueueDemo(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		rear = -1;
	}
	
	public boolean isQueueFull() {
		if(rear == capacity - 1)
			return true;
		else
			return false;
	}
	
	public boolean isQueueEmpty() {
		if(rear == -1)
			return true;
		else
			return false;
	}
	
	public Integer peek() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty , can not perform peek");
			return null;
		}
			
		return arr[0];
	}
	
	public int count() {
		return rear + 1;
	} 
	
	public void displayQueue() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty , can not display its elements");
			return;
		}
		System.out.println("Current Queue.......");
		
		for(int i = 0 ; i <= rear ; i++) {
			System.out.print(arr[i] + " |");	
		}
		
		System.out.println();	
	}
	
	public void enqueue(int element) {
		if(isQueueFull()) {
			System.out.println("Queue is full , can not add new elements");
			return;
		}
		
		rear++;
		arr[rear] = element;
	
	}
	
	public Integer dequeue() {
		if(isQueueEmpty()) {
			System.out.println("Queue is empty , can not remove element");
			return null;
		}
		
		int item = arr[0];
		
		for(int i = 0 ; i < rear ; i++) {
			arr[i] = arr[i + 1];
		}
		
		rear--;
		return item;
	}

}









