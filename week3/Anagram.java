package assignment.week3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "potss"; 
		if (text1.length()==text2.length()) {
	     System.out.println(text1.length());	
		
		char[] C1 = text1.toCharArray();
		char[] C2 = text2.toCharArray();
		
		Arrays.sort(C1);
		Arrays.sort(C2);
		
		boolean equals = Arrays.equals(C1, C2);
		if (equals) {
			System.out.println("String have same Character");
		}
			else {
				System.out.println("String have different character");
			}
		
		}	
		else {
			System.out.println("String have different length");

	}
}
}

