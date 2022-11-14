package com.gl.prework;

public class SwapNum {

	public static void main(String[] args) {
		int a=10,b=15;
		
		System.out.println("before swap : "+a+" " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swap : "+a+" "+b);

	}

}
