package com.Ineuron.Assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem7 {

	public static void main(String[] args) {

		List<String> automationTypes = new ArrayList<>();
		automationTypes.add("Web Automation");
		automationTypes.add("API Automation");
		automationTypes.add("Mobile Automation");
		
		// if list contains Mobile
		System.out.println("List contains given String value::"+Problem7.contains("Mobile", automationTypes));
		
		
	}
	
	public static boolean contains(String val, List<String> list) {
		Iterator<String> iterator = list.iterator();
		boolean isValPresent = false;
		while(iterator.hasNext()) {
			if(iterator.next().contains(val)) {
				isValPresent= true;
			}
		}
		return isValPresent;
		
		
	}

}
