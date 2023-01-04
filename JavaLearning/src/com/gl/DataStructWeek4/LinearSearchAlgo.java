package com.gl.DataStructWeek4;

public class LinearSearchAlgo {
	static int linearsearch(int arr[], int key, int size) {
		int i = 0;
		for (i = 0; i < size; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[] = { 10, 21, 5, 13, 61, 12 };
		int size = array.length;
		int keyElement = 51;

		int position = linearsearch(array, keyElement, size);
		if (position == -1) {
			System.out.println("search not successful");
		} else {
			System.out.println("search successful " + array[position]);
		}

	}

}
