/*Q3. Write a Java program to Create an array and insert the elements like
{ 15 , 32 , 24, 67 ,49,10}
1. Using linear Search Find the position of 67
2. Insert an element 50 and display the message “Element not Found”*/
package dsaAssignment5;

public class CreatArray {
//	int[] array;
	
	public static void findElement(int arr[],int element) {
		
		int flag=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==element) {
				System.out.println("The given element "+element+" is found at position "+i);
				flag=1;
				break;
	
			}
			
		}
		if(flag!=1) {
			System.out.println("\nElement "+element+" not found in the array");
		}
	}

	public static void main(String[] args) {
		int[] arr= {15,32,24,67,49,10};
		
		findElement(arr,67);
		
		findElement(arr,50);
		

	}

}
