package com.gl.DataStructWeek4;

public class BubbleSortDemo {
	static void BubbleSort(int arr[]) {
		int temp, i, j;
		System.out.println("array length" + arr.length);
		for (j = 0; j < arr.length; j++) {
			for (i = 0; i < (arr.length-1)-j; i++) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 100, 60, 50, 40, 20, 11 };

		System.out.println("array before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		BubbleSort(arr);

		System.out.println("array after sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}