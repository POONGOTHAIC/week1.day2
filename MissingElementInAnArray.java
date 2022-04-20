package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String[]args){
		int[] arr = {1,2,3,4,7,6,8};
		int i = 1;
		Arrays.sort(arr);
		for(i = arr[0]; i <= arr.length; i++)
		{
			
			if(i!=arr[i-1])
			{
		
				System.out.println("The current array Element value is :"+arr[i-1]);
				System.out.println("The Missing Element in an  Array is: "+i);
				break;
		
			}
			
	}
		
	}

}
