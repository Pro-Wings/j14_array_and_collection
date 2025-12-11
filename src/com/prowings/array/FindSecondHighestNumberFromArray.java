package com.prowings.array;

import java.util.Arrays;

public class FindSecondHighestNumberFromArray {
	
	public static void main(String[] args) {
		
		
		int[] nums = {12};
		
		int res = findSecondHighestNumber(nums);
		
		System.out.println("Second highest number is : "+ res);
	}

	public static int findSecondHighestNumber(int[] nums) {
		
		if(nums.length < 2)
			throw new RuntimeException("Invalid Array size!!");
		
		Arrays.sort(nums);
		return nums[nums.length - 2];
		
	}

}
