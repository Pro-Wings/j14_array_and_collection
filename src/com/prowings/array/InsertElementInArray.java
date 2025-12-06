package com.prowings.array;

import java.util.Arrays;

/**
 * @CopyRight alksjdlkasjdlksadj 
 * 
 */
public class InsertElementInArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70,80};
		int elementToInsert = 101;
		int position = 5;

		int[] result = insertAt(elementToInsert, position, numbers);
		
		System.out.println(Arrays.toString(result));
	}

	/**
	 * @author Shree
	 * @param elementToInsert
	 * @param position
	 * @param numbers
	 * @return new array with given element inserted in given position
	 * @throws RuntimeException if invaild position
	 */
	public static int[] insertAt(int elementToInsert, int position, int[] numbers) {

		//if position is invalid - not in range then break the code
		if((position < 0) || (position > numbers.length-1))
			throw new RuntimeException("Invalid Position!!");
			
		//create a new array with 1 extra element and copy incoming array into it
		int[] newnumbers = new int[numbers.length+1];
		for(int i=0; i<numbers.length; i++)
			newnumbers[i]=numbers[i];
		
		System.out.println(Arrays.toString(newnumbers));
		
			for(int i=newnumbers.length-2; i >= position; i--)
			{
				newnumbers[i+1] = newnumbers[i];
			}
			newnumbers[position] = elementToInsert;
			
		return newnumbers;
	}

	
	
	
}
