package com.gl.DataStructWeek5;

import java.util.Arrays;

import com.sun.tools.javac.code.Attribute.Array;

public class RadixSortDemo {

	public static void main(String[] args) {
		int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		int size = arr.length;

		System.out.println("array before sorting");
		printArray(arr);

		radixSort(arr, size);

		System.out.println("arry after sorting");
		printArray(arr);

	}

	private static void radixSort(int[] arr, int size) {
		int m = getMaxElement(arr, size);

		for (int exp = 1; m / exp > 0; exp *= 10) {
			countSort(arr, size, exp);
//			printArray(arr);
		}

	}

	private static int getMaxElement(int[] arr, int size) {
		int max = arr[0];

		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	private static void countSort(int[] arr, int size, int exp) {
		int output[] = new int[size];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// store count of occurrence
		for (i = 0; i < size; i++) {
			count[(arr[i] / exp) % 10]++;
		}

		// add all count simultaneously

		for (i = 1; i < 10; i++) {
			count[i] += count[i - 1];
		}

		for (i = size - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10]-1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}
		// copy sorted array to output
		for (i = 0; i < size; i++) {
			arr[i] = output[i];
		}

	}

	private static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
