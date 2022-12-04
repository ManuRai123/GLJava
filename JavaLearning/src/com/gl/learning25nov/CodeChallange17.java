package com.gl.learning25nov;

public class CodeChallange17 {
	public int num=10,output;
	public int performLeftShift() {
		output = num << 1;
		return output;
	}
	public void performRightShift(int val , int digitstoshift) {
		num =val;
		output = num >> digitstoshift;
		System.out.println("right shift of num : "+num+ " is : "+output);
	} 
	public static void main(String[] args) {
		CodeChallange17 obj = new CodeChallange17();
		
		System.out.println("left shift of num "+obj.num+" is : "+obj.performLeftShift());
		obj.performRightShift(45, 1);
		
		
	}

}
