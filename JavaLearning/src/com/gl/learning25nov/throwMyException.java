package com.gl.learning25nov;

class myException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	myException() {
	}
	myException(String str){
		super(str);
	}
}

public class throwMyException {

	public static void main(String[] args) throws myException {
		
		throw new myException("yeppeeee My exception");

	}

}
