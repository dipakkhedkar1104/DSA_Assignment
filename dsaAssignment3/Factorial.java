/*Q4 . Write a java program to find factorial of a number using any recursion
Technique*/
package dsaAssignment3;

public class Factorial {

	public static void main(String[] args) {
		
		int n=6,fact;
		fact=factorial(n);
		System.out.println("\nFactorial of "+n+" = "+fact);
	}

	public static int factorial(int n) {
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
}
