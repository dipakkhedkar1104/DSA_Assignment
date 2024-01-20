package dsaAssignment5;

public class BubbleSortEx 
{
	int flag;

	public void bubbleSorting(int arr[])
	{
		int i;  
		for(i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					//swap arr[j] and arr[j+1]
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		
	}
	public void display(int arr[])
	{
		for(int num : arr)	
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		BubbleSortEx bSort = new BubbleSortEx();
		int array[] = {5, 1, 6, 2, 4, 3, 7};
		
		
		System.out.print(" Original Array                  : ");
		bSort.display(array);
		
		System.out.print(" Sorted Array in Ascending Order : ");
		bSort.bubbleSorting(array);
		bSort.display(array);
	}
}

