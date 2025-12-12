package com.prowings.array;

import java.util.Arrays;

public class ArraysFillMethod {
	
	public static void main(String[] args) {
		
		
		int[] nums = new int[5];
		
		System.out.println(Arrays.toString(nums));
		
		Arrays.fill(nums, 10);
		
		System.out.println(Arrays.toString(nums));
		
	}

}
