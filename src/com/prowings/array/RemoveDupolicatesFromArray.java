package com.prowings.array;

import java.util.Arrays;

public class RemoveDupolicatesFromArray {
	
	public static void main(String[] args) {
		
		int[] nums = {10,30,10,20,30};
		
		
		System.out.println("Before removal of duplicates : "+Arrays.toString(nums));
		
		int[] uniqueNums = removeDuplicates(nums);
		
		System.out.println(Arrays.toString(uniqueNums));
	}

	public static int[] removeDuplicates(int[] nums) {
		
		int[] res = new int[nums.length];
		
		Arrays.sort(nums);
		System.out.println("Nums[] after sorting : "+Arrays.toString(nums));
		int j = 0;
		for(int i=0; i<nums.length-1; i++)
		{
			if(nums[i] != nums[i+1])
			{
				res[j] = nums[i];
				j++;
			}
		}
		res[j] = nums[nums.length-1];
	
		int[] finalRes = new int[j+1];
		
		for(int k=0; k<finalRes.length; k++)
		{
			finalRes[k] = res[k];
		}
		return finalRes;
	}

}
