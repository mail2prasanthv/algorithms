package com.alg.linear;

public class Prg6_ReverseStringUsingArray {
	public static void main(String[] args) {
		
		String name = "I am Prasanth";
		String revName="";
		
		for (int i=name.length()-1; i>=0; i--) {
			revName = revName.concat(""+ name.charAt(i));
		}
		System.out.println(revName);
	}

}
