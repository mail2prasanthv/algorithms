package com.alg.linear;

public class Prg1_LinearBigO {

	public static void main(String[] args) {
		
		String searchKeyword ="a";
		
		String[] elements = new String[]{"a"}; 
		searchMe(elements, searchKeyword);
		
		elements = new String[]{"a","a"}; 
		searchMe(elements, searchKeyword);
		
		elements = new String[]{"a","a","a"}; 
		searchMe(elements, searchKeyword);
		
		elements = new String[]{"a","a","a","a"}; 
		searchMe(elements, searchKeyword);
		
		elements = new String[]{"a","a","a","a","a"}; 
		searchMe(elements, searchKeyword);
		
		elements = new String[]{"a","a","a","a","a","a"}; 
		searchMe(elements, searchKeyword);
	}

	private static void searchMe(String[] elements, String searchKeyword) {
		boolean found = false;
		int noOfOperations = 0;
		
		for (String element : elements) {
			noOfOperations ++;
			if(element.equals(searchKeyword)) 
			{
				found = true;
			}
		}
		System.out.println("Input elements VS processes " + elements.length + ":" + noOfOperations);
		
	}

}
