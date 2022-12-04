package com.gl.learning25nov;

import java.util.Scanner;

class PolyMorphism{
	int a=10,b=20,c=30;
	void findArea(int a, int b) {
		System.out.println("Area of rectangle : "+(a*b));
	}
	void findArea(int a, int b, int h) {
		System.out.println("Area of cuboid :"+(a*b*h));
	}
}
public class CodeChallenge13 {

	public static void main(String[] args) {
		PolyMorphism obj = new PolyMorphism();
		Scanner input = new Scanner(System.in);
		int l,b,h;
		
		System.out.println("length :");
		l = input.nextInt();
		System.out.println("breadth :");
		b = input.nextInt();
		System.out.println("hieght :");
		h = input.nextInt();
		
		obj.findArea(l,b);
		obj.findArea(l,b,h);
	}

}
