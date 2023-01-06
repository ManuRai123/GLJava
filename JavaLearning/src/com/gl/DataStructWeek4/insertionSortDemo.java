package com.gl.DataStructWeek4;

import java.util.Iterator;

public class insertionSortDemo {
	public static void main(String[] args) {
		int arr[] = { 100, 60, 2, 4, 200, 15, 6, 90 };

		System.out.println("array before insertion sort");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();

		InsertionSort(arr);

		System.out.println("array after insertion sort");
		for (int j : arr) {
			System.out.print(j + " ");
		}
	}

	private static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while ((j > -1) && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j--;

			}
			arr[j + 1] = key;
		}
	}

}
