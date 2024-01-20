/*Q 1. Write a Java program to implement a circular queue of size 5. Following
functionalities must by implemented in the program.

A. A function to check if queue is full
B. A function to check if queue is empty
C. A function to insert an element to queue if queue is not full. Add the elements
10, 25, 38, 45, 60 to circular queue and display the elements.
D. Add 70 to queue
E. Remove 2 elements from queue and display the elements.
F. Add 90 to queue and display the elements.*/
package dsaAssignment2;


public class circularQueueDemo {

	private int[] arr;
	private int capacity;
	private int front,rear;
	
	public circularQueueDemo(int capacity) {
		this.capacity = capacity;
		arr = new int[capacity];
		front = rear = -1;
	}
	
	public boolean isQueueFull() {
		if((rear + 1) % capacity == front)
			return true;
		else
			return false;
	}
	
	public boolean isQueueEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	
	public void traverseQueue() {
		int i;
		
		if(isQueueEmpty()) {
			System.out.println("queue is empty , can not be traversed");
			return;
		}
		
		for(i = front ; i != rear ; i = (i + 1) % capacity) {
			System.out.print(arr[i] + " ");
		}
		
			System.out.print(arr[i]);
		
		System.out.println();
	}
	
	public void enqueue(int element) {
		if(isQueueFull()) {
			System.out.println("queue is full , can not enqueue an element");
			return;
		}
			
		if(isQueueEmpty()) {
			front = rear = 0;
			arr[rear] = element;
			System.out.println(element+" This is the 1st element added in the queue");
			return;
		}
		
		rear = (rear + 1) % capacity;
		arr[rear] = element;
		System.out.println("element "+element+" is enqueued");
	}
	
	public Integer dequeue() {
		if(isQueueEmpty()) {
			System.out.println("queue is empty , can not dequeue "+arr[rear]);
			return null;
		}
		
		if(front == rear) {
			int element = arr[front];
			front = rear = -1;
			
			System.out.print("Element is dequeue ");
			return element;
		}
		
		int element = arr[front];
		front = (front + 1) % capacity;
		System.out.print("Element is dequeue \n");
		return element;
	}
}









