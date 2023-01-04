package com.gl.DataStructWeek4;

import java.util.Scanner;

public class GoldenRectangleDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of Rectangles");
			int NumRectangle = sc.nextInt();

			double[][] rectangle = new double[NumRectangle][2];

			System.out.println("enter height and width");
			for (int j = 0; j < NumRectangle; j++) {
				System.out.print(j + " :  width = ");
				rectangle[j][0] = sc.nextInt();
				System.out.print("hieght = ");
				rectangle[j][1] = sc.nextInt();
				System.out.println();
			}

			for (int i = 0; i < NumRectangle; i++) {
				if (findGoldenReactangle(rectangle[i][0], rectangle[i][1])) {
					System.out.println("Huurrey!!! Golden rectangle" + i);
				} else {
					System.out.println("Not a Golden rectangle" + i);

				}
			}
		}

	}

	private static Boolean findGoldenReactangle(double width, double height) {
		double ratio;

//		System.out.println("width : " + width + " height:" + height);
		if (width > height) {
			ratio = (width / height);
//			System.out.println("ratio: " + ratio);
			if ((ratio >= 1.6) && (ratio <= 1.7)) {
				return true;
			}
		} else if (height > width) {
			ratio = (height / width);
//			System.out.println("ratio: " + ratio);
			if ((ratio >= 1.6) && (ratio <= 1.7)) {
				return true;
			}

			else {
				return false;
			}
		}
		return false;
	}
}
