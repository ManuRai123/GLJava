package com.gl.DataStructWeek5;

public class QuickSortDemo {

	public static void main(String[] args) {
		int arr[] = { 5, 75, 12, 69, 15, 100, 30, 20, 11, 25 };
		int n = arr.length;

		quicksort(arr, 0, n - 1);

		System.out.println("sorted array");
		printarray(arr);

	}

	private static void quicksort(int[] arr, int low, int high) {
		if (low < high) {
			printarray(arr);
			int p_index = partition(arr, low, high);
			quicksort(arr, low, p_index - 1);
			quicksort(arr, p_index + 1, high);
		}

	}
	
static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);

		for (int j = low; j <= high - 1; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);

		return (i + 1);
	}

	private static void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printarray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

	}

}
