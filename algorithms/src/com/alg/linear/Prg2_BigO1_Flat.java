package com.alg.linear;

public class Prg2_BigO1_Flat {

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

		String[]  elementsNew= new String[]{elements[0]};
		
		int noOfOperations=0;
		boolean found = false;
		for (String element : elementsNew) {
			noOfOperations ++;
			if(element.equals(searchKeyword)) 
			{
				found = true;
			}
		}
		System.out.println("Input elements VS processes " + elements.length + ":" + noOfOperations);
		
	}

}
