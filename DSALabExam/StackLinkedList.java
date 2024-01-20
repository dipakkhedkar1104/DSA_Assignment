// b. Implement stack using linked list

package DSALabExam;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Stack {
	private Node top;

	public Stack() {
		this.top = null;
	}
 
	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
		System.out.println("-->"+data + " pushed to the stack");
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int popped = top.data;   //lifo
		top = top.next;
		return popped;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
	public void displayStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        Node current = top;
        System.out.println("Current Stack elements:\n");
        while (current != null) {
            System.out.println("\t| "+current.data + " |");
            System.out.println("\t|----| ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackLinkedList {

	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push(30);
		stack.push(10);
		stack.push(11);
		stack.push(99);
		
		stack.displayStack();

		System.out.println("Top element: " + stack.peek());
		
		System.out.println("Popped element: " + stack.pop());
		stack.displayStack();
		
		System.out.println("Popped element: " + stack.pop());
		stack.displayStack();
		
		System.out.println("Top element after pop: " + stack.peek());
		
		stack.push(55);
		stack.displayStack();
		}
}


