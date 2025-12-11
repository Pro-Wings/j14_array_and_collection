package com.prowings.array;

import java.util.Arrays;

public class ArraySortingUsingBubbleSort2 {
	
	public static void main(String[] args) {
		
		String[] names = {"Ram", "Amar", "Sham", "Rajesh"};

		System.out.println("Before Sorting : "+Arrays.toString(names));
		
		Arrays.sort(names);
		
		System.out.println("After Sorting : "+Arrays.toString(names));
		
	}


}
