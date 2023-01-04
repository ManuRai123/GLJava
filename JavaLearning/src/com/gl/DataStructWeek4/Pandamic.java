package com.gl.DataStructWeek4;

import java.util.Scanner;

public class Pandamic {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int numOfVaccine = 0;

			System.out.println("enter total number of vaccine available : ");
			numOfVaccine = sc.nextInt();

			int[] patientImmunity = new int[numOfVaccine];
			int[] vaccineImmunity = new int[numOfVaccine];
			int i;
			int count = 0;

			System.out.println("enter patients Immunity");
			for (i = 0; i < numOfVaccine; i++) {
				System.out.print(i + " : ");
				patientImmunity[i] = sc.nextInt();
				System.out.println();
			}
			System.out.println();
			System.out.println("enter Vaccine Immunity");
			for (i = 0; i < numOfVaccine; i++) {
				System.out.print(i + " : ");
				vaccineImmunity[i] = sc.nextInt();
				System.out.println();
			}
			BubbleSort(patientImmunity);
			BubbleSort(vaccineImmunity);
			
			System.out.print("vaccine Immunity:");
			for (int j : vaccineImmunity) {
				System.out.print(j+" ");
			}
			System.out.println();
			System.out.print("patient Immunity:");
			for (int k : patientImmunity) {
				System.out.print(k+" ");
			}
			System.out.println();
			
			for (i = 0; i < numOfVaccine; i++) {
				if (vaccineImmunity[i] < patientImmunity[i]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println("patient cannot be saved");
			} else {
				System.out.println("Hurrey!!!!! Patentient can be saved");
			}
		}
	}

	private static void BubbleSort(int[] arr) {
		int i, j, temp;

		for (j = 0; j < arr.length; j++) {
			for (i = 0; i < arr.length -1; i++) {
				if (arr[i] < arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
