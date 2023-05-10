package assignment.week3;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		int[] num1={3,2,11,4,6,7};
		int[] num2={1,2,8,4,9,7};
		List<Integer> intersec = new ArrayList<Integer>();
	Set<Integer> intersec1=new LinkedHashSet<Integer>();
		
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (num1[i]==num2[j]) {					 
					intersec.add(num1[i]);
					intersec1.add(num1[i]);
										
				}
			}
		}
			System.out.println(intersec);
			//System.out.println(intersec1);
			
				
			}
		}
	


