/*Qn1. Create an array & insert the elements like 26 54 93 17 77 31 44 55 20 sort the
array in Ascending order using Selection sort and display the result.*/
package dsaAssignment6;

class SelectionSort
{
	void sort(int arr[])
	{
		int n = arr.length;

		for (int i = 0; i < n-1; i++)
		{
			int smallest = i;

			for (int j = i+1; j < n; j++) {
				if (arr[j] < arr[smallest])
					smallest = j;
			}

			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
	}

	void printArray(int arr[])
	{
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	public static void main(String args[])
	{
		SelectionSort s = new SelectionSort();
		int arr[] = {26, 54, 93, 17, 77, 31, 44, 55, 20};
		System.out.println("Actual array");
		s.printArray(arr);
		s.sort(arr);
		System.out.println("\nSorted array");
		s.printArray(arr);
	}
}

