/*2. Write a Java class named ArrayDemo with
the following methods * data members
* an empty array of size 10 as data member of the class
Following methods
i) A method that accept a value from user and store it to the array at the
last position
ii) A method to traverse the array and display all the elements
Call the methods from main method.*/
package dsaAssignment1;

public class ArrayDemo {
	private int[] arr= {0,0,0,0,0,0,0,0,0,0};
	private int arraySize=0;
	
	public boolean isArrayFull() {
		if(arraySize==arr.length) {
			return true;
		}
		return false;
		
	}
	
	public void addElementAtLast(int element) {
		if(isArrayFull()) {
			System.out.print("Array capacity is full, can not add element...");
			return;
			
		}
		
		arr[arraySize]=element;
		arraySize++;	
		
	}
	
	public void display() {
		System.out.print("\nArray after adding element at last position:\n===> ");
		for (int i=0;i<arraySize;i++) {
			System.out.print(arr[i]+", ");
		}
		
	}

}
