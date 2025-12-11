package com.prowings.array;

import java.util.Arrays;

public class ArraySortingUsingBubbleSort {
	
	public static void main(String[] args) {
		
		int[] nums = {2,5,1,3,4};
		
		System.out.println("Before Sorting : "+Arrays.toString(nums));
		
//		sortArrayUsingBubbleSort(nums);
		
		Arrays.sort(nums);
		
		System.out.println("After Sorting : "+Arrays.toString(nums));
		
	}

	public static void sortArrayUsingBubbleSort(int[] nums) {
		
		System.out.println("Bubble sorting started!!");
		
		for(int i=0; i<nums.length-1; i++)
		{
			
			for(int j=0; j<nums.length-1-i; j++)
			{
				if(nums[j] > nums[j+1])
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println("Bubble sorting ended!!");
		
	}

}
