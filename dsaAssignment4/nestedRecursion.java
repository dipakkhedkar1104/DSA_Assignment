//Q3 Consider the following recursion function.
package dsaAssignment4;

public class nestedRecursion {
	
	public static int A(int x, int y)
	{
	if(x==0)
	{

		return (y+1);
	}
	if(y==0)
	{
		return (A(x-1,1));
	}
	else
	{
		return (A(x-1,A(x,y-1)));
	}
	}

	

	public static void main(String[] args) {
		
		System.out.println(A(1,5));

	}
}
//What is the output______7. if A(1,5) is called? Explain the Concept.
