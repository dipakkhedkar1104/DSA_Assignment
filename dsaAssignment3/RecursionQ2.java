/*Q2 . Write a program to display numbers from 1 to n (in any order)
Using recursion [ tail & head ].*/

//package dsaAssignment3;
//
//
//public class RecursionQ2 {
//static void recursionTail(int n) {
//		
//		if(n<=10) {
//			System.out.print(n+", ");
//			recursionTail(n+1);
//		}
//	}
//
//	public static void main(String[] args) {
//
//		recursionTail(1);
//		System.out.println("\nNumbers are printed using Tail recursion");
//	}
//	
//	
//}

package dsaAssignment3;
public class RecursionQ2 {
static void recursionHead(int n) {
		
		if(n == 11)
		return;

		
		recursionHead(n+1);	//recursive call
		
		System.out.print(n+", ");
		
		
	}

	public static void main(String[] args) {
		
		int x = 1;
		
		
		recursionHead(x);
		System.out.print("\nprinting number using head recursion\n ");
		
		

	}
	
	
}


/**/