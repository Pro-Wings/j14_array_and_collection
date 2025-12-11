package com.prowings.array;

import java.util.Arrays;

public class SortArrayDecendingOrder {
	
	public static void main(String[] args) {
		
		int[] nums = {10,70,20,40,30,5};
		
		Arrays.sort(nums);
		
		System.out.println("Ascending Order : "+Arrays.toString(nums));
		
		int j = 0;
		int[] result = new int[nums.length];
		
		for(int i=nums.length-1; i>=0; i--)
		{
			result[j] = nums[i];
			j++;
		}
		
		System.out.println("Descending Order : "+Arrays.toString(result));
		
	}

}
