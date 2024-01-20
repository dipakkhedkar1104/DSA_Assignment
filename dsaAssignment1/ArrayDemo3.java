/*3. Write a Java class named ArrayDemo with an array as data member and
the following methods
a. A method that takes a position and a value as parameter and
insert the value at the position
b. A method that takes a position as parameter and delete the
element at the position
c. A method that takes a value as parameter and delete the
value from the array
d. Traverse the array and display the elements
Create a class with the main method. Create an array inside the main
method. Call the methods in ArrayDemo class from the main method*/
package dsaAssignment1;

public class ArrayDemo3 {

	private int[] arr;
	private int size_of_array;
	
	public ArrayDemo3(int[] arr , int size_of_array) {
		this.arr = arr;
		this.size_of_array = size_of_array;
		
	}
	
	public boolean isArrayEmpty() {
		if(size_of_array == 0)
			return true;
		else
			return false;
	}
	
	public boolean isArrayFull() {
		if(size_of_array == arr.length)
			return true;
		else
			return false;
	}
	
	public void traverseArray() {
		
		if(isArrayEmpty()) {
			System.out.println("Array is empty , can not show elements");
			return;
		}
		
		for(int i = 0 ; i < size_of_array ; i++)
			System.out.print(arr[i] + " ");
		
		System.out.println();
	}
	
	public void addNewElement(int element , int position) {
		
		if(position <= 0 || position > arr.length) {
			System.out.println("invalid position entered");
			return;
		}
		
		if(isArrayFull()) {
			System.out.println("Array is full , can not add new element");
			return;
		}
		
		for(int i = size_of_array - 1 ; i >= position - 1 ; i--) {
			arr[i+1] = arr[i];
		}
		
		arr[position - 1] = element;
		size_of_array++;
		System.out.println("\nArray after Adding element "+element+", at "+position+" position");
		traverseArray();
	}
	
	public void deleteElement(int position) {
		
		if(position <= 0 || position > arr.length) {
			System.out.println("invalid position entered");
			return;
		}
		
		if(isArrayEmpty()) {
			System.out.println("Array is empty , can not delete element");
			return;
		}
		int deleted_element=arr[position-1];
		
		for(int i = position - 1 ; i < size_of_array ; i++) {
			arr[i] = arr[i + 1];
		}
		
		size_of_array--;
		System.out.println("\nArray after deleting element "+deleted_element+" at position "+position);
		traverseArray();
	}
	
	public void deleteByValue(int val) {
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==val) {
				deleteElement(i+1); //i is index and i+1=position
			
				
			}
		}
		
	}
}

