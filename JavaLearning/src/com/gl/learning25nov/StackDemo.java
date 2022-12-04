package com.gl.learning25nov;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println("stack:"+stack.isEmpty());
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		System.out.println("stack : "+stack);
		System.out.println("stack : "+stack.peek());
		System.out.println("stack pop : "+stack.pop()+" stack :  "+stack);
		System.out.println("stack : "+stack.search(8)+stack.search(1));
		
	}

}
