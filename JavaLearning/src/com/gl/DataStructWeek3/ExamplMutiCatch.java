package com.gl.DataStructWeek3;

public class ExamplMutiCatch {

	public static void main(String[] args) {
		try {
			int arr[] =new int[10];
			//arr[0] =20/0;
//			arr[0]=10;
//			arr[10]=arr[1];
			String a= null;
			a.charAt(0);
			
			System.out.println("try block ends");
					
		}
		catch(ArithmeticException ae)
		{
			System.out.println("divide by zero not possible"+ae.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("array out odf bound");
		}
		catch(Exception e ) {
			System.out.println("exception"+e.getMessage());
		}
	}

}
