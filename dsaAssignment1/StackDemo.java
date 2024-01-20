/*4.
Write a Java class StackDemo with methods for the following
functionalities.
* Determine whether a stack is empty.
* Determine whether a stack is full.
* Push a new item to the stack. Before pushing method must check
whether queue is full.
*Remove (pop) from the stack the item that was added most recently
and display it. Before removing method must check whether queue is
empty
Use the above methods try the following from the main method
• Read n inputs from user and push to array
• Remove top k elements from the stack and display.
• Push few more elements to stack
• Remove all the items from the stack and display*/ 


package dsaAssignment1;

public class StackDemo {

	private int arr[];
	private int top;
	
	public StackDemo(int size) {
		arr = new int[size];
		top = -1;
	}
	
	public boolean isStackEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isStackFull() {
		if(top == arr.length - 1)
			return true;
		else
			return false;
	}
	
	public Integer peek() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not perform peek operation");
			return null;
		}
	
		return arr[top];
		
	}
	
	public void displayStack() {
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not display elements");
			return;
		}
		
		for(int i = top ; i >= 0 ; i--) {
			System.out.println("\t|  "+arr[i]+"  |");
		}
	}
	
	public int count() {
		if(isStackEmpty())
			return 0;
		
		return top + 1;
	}
	
	public void push(int element) {
		
		if(isStackFull()) {
			System.out.println("Stack is full , can not push an element");
			return;
		}
		
		top++;
		arr[top] = element;
		System.out.println("element "+element+" pushed .....");
	}
	
	public Integer pop() {
		
		if(isStackEmpty()) {
			System.out.println("Stack is empty , can not pop an element from the Stack");
			return null;
		}
		
		int item = arr[top];
		top--;
		
		return item;
	}
}