package com.gl.learning25nov;

class InheritanceA{
	int r=10;
	final float pi=3.14f;
	void areaOfCirlce() {
		System.out.println("are of circle"+(pi*r*r));
	}

}
class InheritanceB extends InheritanceA{
	int l=12,b=14;
	void areaOfRectangle() {
		System.out.println("area of rectangle"+l*b);
	}
}
class  InheritanceC extends InheritanceB {
	int l=10,h=15;
	void areaOfTraingle() {
		System.out.println("area of trangle"+(0.5*l*h));
	}
}
public class CodeChllange10 {

	public static void main(String[] args) {
		InheritanceC obj=new InheritanceC();
		obj.areaOfTraingle();
		obj.areaOfRectangle();
		obj.areaOfCirlce();

	}

}
