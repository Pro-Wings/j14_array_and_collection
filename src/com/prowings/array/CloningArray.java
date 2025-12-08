package com.prowings.array;

import java.util.Arrays;

public class CloningArray {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,78,40,50};
		
		
//		int[] numbersCopy = numbers; //copying ref
		
		int[] numbersCopy = numbers.clone();
		
		System.out.println(Arrays.toString(numbersCopy));
		
		numbers[0] = 100;
		System.out.println("after modification in original");
		System.out.println("original"+Arrays.toString(numbers));
		System.out.println("copy"+Arrays.toString(numbersCopy));
		
		
	}

}
