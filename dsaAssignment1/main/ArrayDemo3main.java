package dsaAssignment1.main;
import dsaAssignment1.ArrayDemo3;

public class ArrayDemo3main {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,0,0,0,0,0,0};
		
		ArrayDemo3 a1=new ArrayDemo3(arr, 4);
		System.out.println("Actual array: ");
		a1.traverseArray();
		
		a1.addNewElement(99, 2);
		
		
		a1.deleteElement(3);
		
		System.out.println("\ndeleting element using value");
		a1.deleteByValue(10);
		

	}

}
