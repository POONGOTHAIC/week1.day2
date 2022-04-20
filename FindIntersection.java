package week1.day2.assignment.mandatory;

import java.util.ArrayList;
import java.util.Arrays;

public class FindIntersection {
	public static void main(String[]args0) {			
		 int[] array1 = {3,2,11,4,6,7};
	      int[] array2 = {1,2,8,4,9,7};
	      ArrayList<Integer> matchingarray = new ArrayList<Integer>();
	 
	       System.out.println("Array1 : "+Arrays.toString(array1));
	       System.out.println("Array2 : "+Arrays.toString(array2));
	 
	      
	        for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i] == (array2[j]))
	                {
	                 
	                 //System.out.println("Common element is : "+(array1[i]));
	                 matchingarray.add(array1[i]);
	                 
	                }
			
	            }
	       	}
	       
	       System.out.println("Common Values in Array : "+matchingarray);
	}

}
