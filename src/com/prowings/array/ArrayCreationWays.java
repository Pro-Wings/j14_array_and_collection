package com.prowings.array;

import java.util.Arrays;

public class ArrayCreationWays {
	
	public static void main(String[] args) {
		
		//way 1 - using new keyword
		int[] numbers = new int[500];
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("numbers length : "+numbers.length);
		
		//way2- Initializer List
		
		int[] nums = {10,20,30,40,50};
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		System.out.println(nums[3]);
		
	}

}
