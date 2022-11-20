package com.alg.linear;

public class Prg4_LinearBigO_best_worstCase {

	public static void main(String[] args) {
		
		String[]	elements = new String[]{"a","b","c","d","e","f"}; 
		//best case
		System.out.println("----Best Case----");
		searchMe(elements, "a");
		//worst case
		System.out.println("----Worst Case----");
		searchMe(elements, "f");
	}

	private static void searchMe(String[] elements, String searchKeyword) {
		boolean found = false;
		int noOfOperations = 0;
		
		for (String element : elements) {
			noOfOperations ++;
			if(element.equals(searchKeyword)) 
			{
				found = true;
				break;
			}
		}
		System.out.println("Input elements VS processes " + elements.length + ":" + noOfOperations);
		
	}

}
