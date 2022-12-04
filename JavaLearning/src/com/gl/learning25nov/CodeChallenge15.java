package com.gl.learning25nov;

import java.nio.charset.CharsetDecoder;

public class CodeChallenge15 {
	private int age;
	private boolean decision;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age= age;
	}
	public boolean getDecesion() {
		return decision;
	}
	public void setDecesion(boolean result) {
		this.decision = result ;
	}
	public static void main(String[] args) {
		CodeChallenge15 obj = new CodeChallenge15();
		
		obj.setAge(70);
		
		if(obj.getAge() <=60) {
			obj.setDecesion(true);
		}
		else {
			obj.setDecesion(false);
		}
		
		System.out.println("Age : "+obj.getAge());
		System.out.println("driving license issued : "+obj.getDecesion());
	}
}
