package com.gl.learning18nov;
class AcessModifier{
	protected int age=25;
	public float weight=50.5f;
	private float bmi=16.8f;
	
	public void DisplayPrivateMem(){
		System.out.println(bmi);
	}
}

public class AcessModifierDriver {

	public static void main(String[] args) {
		AcessModifier s1=new AcessModifier();
		System.out.println(s1.age + " "+ s1.weight);
		s1.DisplayPrivateMem();
		

	}

}
