/*1. Create an array of size 10 with the values 10,20,30,40. 
i) Traverse the array and display the elements
ii) Read a number from user and insert it to the array so that the array
still remains in sorted order.*/

package dsaAssignment1;

public class Array1 {
	private int[] arr;
	private int arraySize;
	
	public Array1(int[] arr,int size ) {
		this.arr=arr;
		this.arraySize=size;
		
	}
	
	public void traverseArray() {
		System.out.println("\nArray After adding element: \n");
		for(int i=0;i<arraySize-1;i++) {
			System.out.print(arr[i]+", ");
		}	
		System.out.println();
	}
	
	public void insertElement(int element,int position) {
		if(position<=0 || position >arraySize) {
			System.out.println("enter valid position...");
			return;
		}
		
;
		for(int i = arraySize - 1 ; i >= position - 1 ; i--) {
			arr[i+1] = arr[i];
		}
		
		arr[position - 1] = element;
		arraySize++;
		
	}

}
