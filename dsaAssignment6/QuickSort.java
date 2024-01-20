/*Qn3. Create an array & insert the elements like 10 , 8, 6 ,12,6,15,3 ,9 ,5 20 sort the array
in Ascending order using Quick sort and display the result*/

package dsaAssignment6;
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int[] arr = {10, 8, 6, 12, 6, 15, 3, 9, 5, 20};
        int n = arr.length;

        System.out.println("Unsorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, n - 1);

        System.out.println("\n\nSorted Array (Ascending Order):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
