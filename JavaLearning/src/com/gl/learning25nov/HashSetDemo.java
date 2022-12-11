package com.gl.learning25nov;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> hash = new HashSet<>();
		
		System.out.println(hash);
		hash.add(1);
		hash.add(2);
		hash.add(3);
		System.out.println(hash);
		
		hash.add(5);
		hash.add(5); // dupicated not allowed in hashset
		System.out.println(hash);
	
		Iterator<Integer> itr =hash.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
