package com.gl.learning18nov;

class Customer{
	String fullname;
	int age;
	
}
public class TestClass {

	public static void main(String[] args) {
		Customer obj= new Customer();
		obj.fullname="manu";
		obj.age =14;
		System.out.println(obj.fullname+" " +obj.age);

	}

}
