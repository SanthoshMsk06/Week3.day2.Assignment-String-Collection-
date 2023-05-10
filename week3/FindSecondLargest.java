package assignment.week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// Here is the input
				int[] data = {3,2,11,4,6,7};
				
				List<Integer> SL=new ArrayList<Integer>();
				
				for (int i = 0; i < data.length; i++) {
					SL.add(data[i]);
					
				}
				Collections.sort(SL);
			   System.out.println(SL);
			   
			   Integer FSL = SL.get(SL.size()-2);
			   System.out.println(FSL);
			   
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				

	}

}
