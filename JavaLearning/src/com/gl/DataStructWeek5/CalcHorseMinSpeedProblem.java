package com.gl.DataStructWeek5;

import java.util.Scanner;

public class CalcHorseMinSpeedProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minSpeed = 0;
		System.out.println("enter total number of horses: ");
		int numOfHorses = sc.nextInt();
		int Horses[] = new int[numOfHorses];

		System.out.println("enter speed of horses: ");
		for (int i = 0; i < numOfHorses; i++) {
			Horses[i] = sc.nextInt();
		}
		
		MergeSort(Horses, 0, Horses.length - 1);

		System.out.print("after sorting speed of horses: ");
		for (int i : Horses) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		minSpeed = Horses[1]-Horses[0];
		for (int i = 1; i < numOfHorses-1;i++) {
			if (minSpeed > (Horses[i+1] - Horses[i])) {
				minSpeed = Horses[i+1] - Horses[i];
				System.out.println("min speed "+minSpeed);
			}
		}
		System.out.println("Minimun diffrence between speed of horses : "+minSpeed);

	}

	private static void MergeSort(int[] arr, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;
			MergeSort(arr, left, mid);
			MergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}
	}

	private static void merge(int[] arr, int l, int m, int r) {
		{
			// Find sizes of two subarrays to be merged
			int n1 = m - l + 1;
			int n2 = r - m;

			/* Create temp arrays */
			int L[] = new int[n1];
			int R[] = new int[n2];

			/* Copy data to temp arrays */
			for (int i = 0; i < n1; ++i)
				L[i] = arr[l + i];
			for (int j = 0; j < n2; ++j)
				R[j] = arr[m + 1 + j];

			/* Merge the temp arrays */

			// Initial indexes of first and second subarrays
			int i = 0, j = 0;

			// Initial index of merged subarray array
			int k = l;
			while (i < n1 && j < n2) {
				if (L[i] <= R[j]) {
					arr[k] = L[i];
					i++;
				} else {
					arr[k] = R[j];
					j++;
				}
				k++;
			}

			/* Copy remaining elements of L[] if any */
			while (i < n1) {
				arr[k] = L[i];
				i++;
				k++;
			}

			/* Copy remaining elements of R[] if any */
			while (j < n2) {
				arr[k] = R[j];
				j++;
				k++;
			}
		}
	}
}
