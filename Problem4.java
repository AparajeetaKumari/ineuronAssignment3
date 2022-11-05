package com.Ineuron.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem4 {
	
	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		// add list values
        list.add(1);
        list.add(3);
        list.add(9);
        list.add(10);
        list.add(20);
        list.add(19);
        
        //print sum of list values
       System.out.println("Sum is::"+ Problem4.sum(list));
        
        
	}
	
	public static int sum(List<Integer> list) {
		Iterator<Integer> iterator = list.iterator();
		int sum =0;
		while(iterator.hasNext()) {
			sum = sum + iterator.next();
		}
		return sum;
		
	}

}
