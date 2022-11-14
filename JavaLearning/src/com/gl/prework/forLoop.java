package com.gl.prework;

public class forLoop {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};

		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}

		for(int x : a) {
			System.out.println(x);
		}

	}

}
