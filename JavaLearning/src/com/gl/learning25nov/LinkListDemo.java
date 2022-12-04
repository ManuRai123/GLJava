package com.gl.learning25nov;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		System.out.println("list : "+list.peek());
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("list : "+list);
		System.out.println("list first parametre : "+list.getFirst());
		list.add(0, 10);
		System.out.println("list : "+list);
		list.offer(8);
		System.out.println("list : "+list);
		System.out.println("list : "+list.poll()+","+list.pollFirst()+","+list.pollLast());
		
	}

}
