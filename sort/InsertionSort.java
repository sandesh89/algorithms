package sort;

import utils.PrintUtils;

/**
 * @author sandesh
 *
 *         Worst Case : O(n^2).
 * 
 *         Best Case : O(n). Has to iterate the elements once.
 *
 *         In Place: Yes
 */
public class InsertionSort {

	public static void main(String[] args) {

		// int arr[] = { 36, 7, 72, 67, 22, 88 };
		int arr[] = { 567, 100, 88, 77, 44, 21, 3 };
		int n = arr.length;
		insertionSort(arr, n);

	}

	private static void insertionSort(int[] arr, int n) {
		PrintUtils.printArray(arr);
		for (int i = 1; i < n; i++) {
			int j = i - 1;
			int key = arr[i];
			System.out.print("\n");
			PrintUtils.printArrayCurrent(arr, i, j);

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				PrintUtils.printArrayCurrent(arr, i, j);
				j--;
			}
			arr[j + 1] = key;
			PrintUtils.printArrayCurrent(arr, i, j);
		}

		PrintUtils.printArray(arr);
	}

}
