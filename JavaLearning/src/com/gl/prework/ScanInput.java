package com.gl.prework;
import java.util.Scanner;

public class ScanInput {

	public static void main(String[] args) {
		int num1 = 1;
		float num2;
		char character;
		boolean bool=true;
		String str;
		double num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int value ");
		num1 = sc.nextInt();
		System.out.println("enter float value ");
		num2 = sc.nextFloat();
		System.out.println("enter string value ");
		str = sc.next();
		System.out.println("enter double value ");
		num3 = sc.nextDouble();
		System.out.println("enter boolean value ");
		bool = (boolean)sc.nextBoolean();
		System.out.println("enter character value ");
		character = sc.next().charAt(0);
		
		System.out.println("int -> " + num1);
		System.out.println("float -> " + num2);
		System.out.println("char -> " + character);
		System.out.println("boolean -> " + bool);
		System.out.println("String -> " + str);
		System.out.println("double -> " + num3);

	}

}
