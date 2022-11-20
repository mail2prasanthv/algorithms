package com.alg.linear;

public class Prg5_DifferentTermsForInput {

	public static void main(String[] args) {
		
		String searchKeyword ="a";
		
		String[] elementsSet1 = new String[]{"a"}; 
		String[] elementsSet2 = new String[]{"a"}; 
		searchMe(elementsSet1, elementsSet2, searchKeyword);
	}

	private static void searchMe(String[] elementsSet1, String[] elementsSet2, String searchKeyword) {
		boolean found = false;
		
		for (String element : elementsSet1) { //O(a) for elementsSet1
			if(element.equals(searchKeyword)) 
			{
				found = true;
			}
		}
		for (String element : elementsSet2) { //O(b) for elementsSet2
			if(element.equals(searchKeyword)) 
			{
				found = true;
			}
		}
	}
}
//O(a) + O(b) = O(a+b) 

