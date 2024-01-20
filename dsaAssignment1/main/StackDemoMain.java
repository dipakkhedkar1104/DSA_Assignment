package dsaAssignment1.main;
import dsaAssignment1.StackDemo;
import java.util.Scanner;

public class StackDemoMain {

	public static void main(String[] args) {
		int stackSize;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter stack Size: ");
		stackSize=sc.nextInt();

		StackDemo obj = new StackDemo(stackSize);
		
		for(int i=0; i<stackSize;i++) {
			System.out.print("Enter stack element: ");
			obj.push(sc.nextInt());
		}
		
		
		System.out.println("\nAll elements from the stack are :- ");
		obj.displayStack();
		
		for(int i=0; i<stackSize;i++) {
			
			System.out.println("\nresult after pop() : " + obj.pop());
			obj.displayStack();
		}	
	}
}
