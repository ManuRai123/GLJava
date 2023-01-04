package com.gl.DataStructWeek3;

import java.net.HttpRetryException;

public class ExMultipleTryBlock {

	public static void main(String[] args) {
		try {
			try {
				try {
					int arr[] = new int[10];
					arr[11] =10;
					
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("block1");
					throw e;
				}
				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("block 2");
				throw e;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Block 3 Array out of bound"); 
			
		}

	}

}
