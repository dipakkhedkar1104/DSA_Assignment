package dsaAssignment1.main;
import dsaAssignment1.Array1;

public class Array1Main {

	public static void main(String[] args) {
		
		int[] arr= {10,20,30,40,0,0,0,0,0,0};
		Array1 a1=new Array1(arr, 5);
		a1.traverseArray();
		
		a1.insertElement(25, 2);
		a1.traverseArray();
		
		a1.insertElement(44, 5);
		a1.traverseArray();

	}

}
