/*Q3. Write a java program to find Sum of First 10 even Numbers using
any recursion Technique*/

package dsaAssignment3;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int n=10,sum;
		sum=sumOfEvenNumbers(n);
		System.out.println("\nSum of first "+n+" even numbers is = "+sum);
	}
	
	public static int sumOfEvenNumbers(int n) {
		
		if(n<1)
			return 0;
		System.out.print(n+", ");
		return 2*n +sumOfEvenNumbers(n-1);
		
		}
}