package com.alg.linear;

public class Prg2_BigO2_Flat2 {

	public static void main(String[] args) {
		
		String searchKeyword ="a";
		
		
		String[]	elements = new String[]{"a","a"}; 
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

		String[]  twoElementsArray= new String[]{elements[0], elements[1]};
		
		int noOfOperations=0;
		boolean found = false;
		for (String element : twoElementsArray) {
			noOfOperations ++;
			if(element.equals(searchKeyword)) 
			{
				found = true;
			}
		}
		System.out.println("Input elements VS processes " + elements.length + ":" + noOfOperations);
		
	}

}
