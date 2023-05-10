package assignment.week3;

import java.util.ArrayList;

import org.testng.annotations.IFactoryAnnotation;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		String test = "changeme";
		
		char[] convert = test.toCharArray();
		System.out.println(convert);
		for (int i = 0; i < convert.length; i++) {
			if(i % 2 != 0) {
				convert[i]=Character.toUpperCase(convert[i]);
			}
			System.out.println(convert[i]);

		}
	
	}

}
