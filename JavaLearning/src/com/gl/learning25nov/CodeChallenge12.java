package com.gl.learning25nov;

class A{
	void car() {
		System.out.println("I am method A");
	}
}
class B extends A{
	void car() {
		System.out.println("I am method B");
	}
	
}

public class CodeChallenge12 {

	public static void main(String[] args) {
		A obj = new A();
		A obj1 = new B();
		
		obj.car();
		obj1.car();
		

	}

}
