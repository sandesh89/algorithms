package sort;

import utils.PrintUtils;

/**
 * @author sandesh
 *
 *         Worst Case : O(n^2).
 * 
 *         Best Case : O(n).
 * 
 *         In Place: Yes
 *         
 */
public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 36, 7, 72, 67, 22, 88 };
		//int arr[] = { 567, 100, 88, 77, 44, 21, 3 };
		 //int arr[] = { 3, 6, 88, 235, 356, 899, 8906 };
		int n = arr.length;
		PrintUtils.printArray(arr);

		selectionSort(arr, n);

		PrintUtils.printArray(arr);

	}

	private static void selectionSort(int[] arr, int n) {
		for (int i = 0; i < n-1; i++) {
			int minIndex=i;
			for (int j = i+1; j < n; j++) {
				if (arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		PrintUtils.printArray(arr);

	}
}
