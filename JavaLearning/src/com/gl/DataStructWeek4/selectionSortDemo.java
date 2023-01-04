package com.gl.DataStructWeek4;

import java.util.Scanner;

public class selectionSortDemo {
	static void SelectionSort(int arr[]) {
		int index, smallElement = 0;
		for (int i = 0; i < arr.length; i++) {
			index = i;
			smallElement = arr[i];
			// find index of smallest element
			for (int j = i + 1; j < arr.length; j++) {
				if (smallElement > arr[j]) {
					smallElement = arr[j];
					index = j;
				}
			}
//			System.out.println("small element"+smallElement+"index: "+index);
			// exchange element
			arr[index] = arr[i];
			arr[i] = smallElement;
		}
	}

	@SuppressWarnings("null")
	public static void main(String[] args) {
//		int arr[] = { 10, 5, 30, 2, 90, 11 };
		int k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any 10 channels");
		int[] arr = new int[10];
		for(k=0;k< 10;k++) {
		    arr[k] =(int) sc.nextInt();
		}       

		System.out.println("Array before sorting");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		SelectionSort(arr);

		System.out.println("Array after sorting");
		for (int j : arr) {
			System.out.print(j + " ");
		}

	}

}
