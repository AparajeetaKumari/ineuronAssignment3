package com.Ineuron.Assignment3;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static void main(String args[]) {
		
		List<Integer> input = new ArrayList<>();
		for (int i=0;i<=10;i++) {
			input.add(i);
		}
		
		//print list values using for loop
		for(int j=0;j<input.size();j++) {
			System.out.println(input.get(j));
		}
		
	}
}
