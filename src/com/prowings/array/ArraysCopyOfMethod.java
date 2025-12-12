package com.prowings.array;

import java.util.Arrays;

public class ArraysCopyOfMethod {
	
	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(nums));
		
//		int[] res = Arrays.copyOf(nums, 5);
		int[] res = Arrays.copyOfRange(nums, 5, 10);
		System.out.println(Arrays.toString(res));
		
		
	}

}
