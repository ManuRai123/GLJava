package com.gl.learning25nov;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		List<Integer> list2   = new ArrayList<>();
		
		System.out.println(" before list1"+list1);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println("after list1"+list1);

		
		System.out.println(" before list2"+list2);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.addAll(list1);
		System.out.println("afer list2"+list2);
		
		list2.set(1, 54);
		System.out.println("list2"+list2);
		
		list2.add(2,5 );
		System.out.println("list2"+list2);
		
		list2.remove(0);
		System.out.println("list2"+list2);
		
		
		Iterator<Integer> itr = list2.iterator();
		
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+ ",");
		 }
		 System.out.println();
		 for (Integer obj: list2) {
			 System.out.print(obj.intValue()+",");
		}
		 
		
	}

}
