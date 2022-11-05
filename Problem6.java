package com.Ineuron.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem6 {

	public static void main(String[] args) {
		//create list of integers 33,44,55,66,77,88 
		List<Integer> list = new ArrayList<>();
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		list.add(77);
		list.add(88);
		
		System.out.println("Remove second element from list using index");
		list.remove(1);
		System.out.println(list);
		
		System.out.println("Remove second element from list using value");
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(iterator.next()==55) {
				iterator.remove();
			}
		}
		System.out.println(list);
		
		
		System.out.println("Add 90 at index 3");
		list.add(3, 90);
		System.out.println(list);
		
		
		System.out.println("Get the length of list");
		int length = list.size();
		System.out.println("List size is::"+length);
		
		
		System.out.println("Print all values from list using any values");
		iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Convert List into array.");
		Object[] intArray = list.toArray();
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}
		


	}

}
