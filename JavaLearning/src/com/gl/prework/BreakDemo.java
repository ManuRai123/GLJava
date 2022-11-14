package com.gl.prework;
import java.util.Scanner;

public class BreakDemo {

	public static void main(String[] args) {
		int i=0,num;
		Scanner sc = new Scanner(System.in);
		

		while(i<20) {
			System.out.println("enter the number :");
			i = sc.nextInt();

			if((i%2)!=0) {
				i++;
				continue;

			}
			else {
				System.out.println("table of 2:"+i);
				i++;
				break;
			}

		}


	}

}
