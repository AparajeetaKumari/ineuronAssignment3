package com.Ineuron.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Problem5 {

	public static void main(String args[]) {
		//initialize an array of String values
		String[] values= {"API Testing","Website Testing","Mobile Testing"};
		
		//convert array to list
		List<String> listVals= new ArrayList<>();
		Collections.addAll(listVals, values);
		
		//print list values
		Iterator<String> iterator = listVals.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
