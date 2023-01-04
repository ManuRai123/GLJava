package com.gl.DataStructWeek4;

public class CableOopeartorDemo {
	static void SelectionSort(int arr[][]) {
		int index, smallElement = 0;
		int temp[][] = { { 0, 0 } };
		for (int i = 0; i < arr.length; i++) {
			index = i;
			temp[0][0] = arr[i][0]; // index
			temp[0][1] = arr[i][1]; // element
			smallElement = arr[i][1];

			// find index of smallest element
			for (int j = i + 1; j < arr.length; j++) {
				if (smallElement > arr[j][1]) {
					temp[0][0] = arr[j][0];
					temp[0][1] = arr[j][1];
					smallElement = arr[j][1];
					index = j;
				}
			}
			//			System.out.println("small element"+smallElement+"index: "+index);
			// exchange element
			arr[index][0] = arr[i][0];
			arr[index][1] = arr[i][1];
			arr[i][0] = temp[0][0];
			arr[i][1] = temp[0][1];

		}
	}

	public static void main(String[] args) {
		int sortChannel[][] = { { 10, 1 }, { 5, 20 }, { 30, 5 }, { 2, 100 }, { 90, 60 }, { 11, 4 } };

		System.out.println("sortChannelay before sorting");
		for (int i = 0; i < (sortChannel.length); i++) {
			System.out.println("channel: " + sortChannel[i][0] + " viewtime: " + sortChannel[i][1]);
		}

		System.out.println();
		SelectionSort(sortChannel);

		System.out.println("sortChannelay after sorting");
		for (int i = 0; i < (sortChannel.length); i++) {
			System.out.println("channel: " + sortChannel[i][0] + " viewtime: " + sortChannel[i][1]);
		}
	}

}
