/*Q4. Create an array and insert the elements in sorted order
Using Binary search Find the particular position of the element, if the element was
not found the show the message “Element Not Found”*/

package dsaAssignment5;

public class BinarySearch {
	public static int binarySearch(int arr[], int element) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			
			if(arr[mid]==element) {
				return mid;
			}
			else if(arr[mid]<element) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}		
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr= {10,20,25,45,50,60,70,72,90};
		
		int elementToSearch=70;   //101
		
		int foundAt=binarySearch(arr,elementToSearch);
		if(foundAt==-1) {
			System.out.println("Element "+elementToSearch+" Not Found!");
		}
		else {
			System.out.println("Element "+elementToSearch+" found at " +foundAt);
		}
	}
}