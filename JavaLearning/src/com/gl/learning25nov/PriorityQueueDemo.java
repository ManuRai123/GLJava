package com.gl.learning25nov;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		System.out.println("priority queue : "+queue);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println("priority queue : "+queue);	
		System.out.println("priority queue : "+queue.element()+" "+queue.peek());
		
		Iterator<Integer> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		queue.poll();
		System.out.println(queue);
		

	}

}
