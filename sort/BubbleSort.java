package sort;

import utils.PrintUtils;

/**
 * @author sandesh
 *
 *         Worst Case : O(n^2).
 * 
 *         Best Case : O(n). After addition of the swapped flas .
 * 
 *         In Place: Yes
 */

public class BubbleSort {

	public static void main(String[] args) {

		// int arr[] = { 36, 7, 72, 67, 22, 88 };
		int arr[] = { 567, 100, 88, 77, 44, 21, 3 };
		// int arr[] = { 3, 6, 88, 235, 356, 899, 8906 };
		int n = arr.length;
		PrintUtils.printArray(arr);

		bubbleSort(arr, n);

		PrintUtils.printArray(arr);

	}

	private static void bubbleSort(int[] arr, int n) {
		int temp;
		
		/*To avoid swapping when elements are already in order*/
		boolean swapped = false;

		for (int i = 0; i < n - 1; i++) {
			System.out.print("\n");
			
			/*ith element has been pushed and sorted*/
			for (int j = 0; j < n - i - 1; j++) {
				PrintUtils.printArrayCurrent(arr, i, j);
				if (arr[j] > arr[j + 1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}

			if (!swapped)
				break;
		}
	}

}
