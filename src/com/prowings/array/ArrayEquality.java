package com.prowings.array;

public class ArrayEquality {
	
	public static void main(String[] args) {
		
		int nums1[] = {10,20,30,40};
		int nums2[] = {10,40,30,40};
		
		boolean res = isEquals(nums1, nums2);
		
		System.out.println( res ? "Both Arrays are equal" : "Both Arrays Not Equal");
		
	}

	public static boolean isEquals(int[] nums1, int[] nums2) {
		
		boolean result = true;
		if(nums1.length != nums2.length)
			result = false;
		
		for(int i=0; i<nums1.length; i++)
		{
			if(nums1[i] != nums2[i])
			{
				result = false;
				break;
			}
		}
		return result;
	}

}
