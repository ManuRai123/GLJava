package com.gl.DataStructWeek4;

public class binarySearchDemo {
	static void binarysearch(int arr[], int first, int key, int last) {
		int mid = (first + last) / 2;

		while (first <= last) {
//			System.out.println("first " + first + "last " + last + "mid " + mid);

			if (arr[mid] == key) {
				System.out.println("element found at index " + mid + " is " + arr[mid]);
				break;
			} else if (arr[mid] < key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last) {
			System.out.println("element not found");
		}
//		System.out.println("job done");
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 }; // sorted array
//		int arr[] = { 10, 20, 30, 40, 50 }; // sorted array
		int key = 70;
		int size = arr.length - 1;
//		System.out.println("started binay search");
		binarysearch(arr, 0, key, size);

	}
}
