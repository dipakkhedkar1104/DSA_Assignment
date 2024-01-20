/*Q1 Write a java program to find the value of 3 raised to 6 using recursion.*/

// 3 (3)*3 (3*3)*3...(3*3*3*...*n)*n --> (n^m-1)*n  ====>n=3, m=6  

package dsaAssignment4;

public class Power {
	
	public static int powerOfThree(int n, int m){
		
		if(m<1) {
			return 1;
		}
		else
			return powerOfThree(n, m-1)*n;	
	}
	
	public static void main(String[] args) {
		
		int n=3, m=6;
		System.out.println("value of "+n+" raised to "+m+" = "+powerOfThree(n,m));

	}
}
