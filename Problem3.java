package com.Ineuron.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem3 {

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<>();
		for (int i=0;i<=10;i++) {
			input.add(i);
		}
		
		//print list values using Iterator
		Iterator<Integer> iterator = input.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		

	}

}
