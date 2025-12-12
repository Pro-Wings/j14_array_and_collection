package com.prowings.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupolicatesFromArray2 {
	
	public static void main(String[] args) {
		
		Integer[] nums = {10,30,10,20,30};
		System.out.println("Before removal of duplicates : "+Arrays.toString(nums));

		Set<Integer> uniqNums = new HashSet<>(Arrays.asList(nums));
		
		System.out.println(uniqNums);
	}

}
