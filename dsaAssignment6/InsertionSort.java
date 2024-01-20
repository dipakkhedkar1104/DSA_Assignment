/*Qn2. Create an array & insert the elements like 8 7 5 9 1 6 2 4 3 sort the array in
Descending order using Insertion sort and display the result.*/
package dsaAssignment6;

public class InsertionSort {
	void sort(int arr[])
	{
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];	
			int j = i - 1;	

			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 8, 7, 5, 9, 1, 6, 2, 4, 3};
		System.out.println("Actual array: ");
		printArray(arr);

		InsertionSort ob = new InsertionSort();
		ob.sort(arr);
		System.out.println("\nDescending Sorted array");
		printArray(arr);
	}
}
