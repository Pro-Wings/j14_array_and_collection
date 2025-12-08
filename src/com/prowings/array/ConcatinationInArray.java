package com.prowings.array;

import java.util.Arrays;

public class ConcatinationInArray {
	
	public static void main(String[] args) {
		
		int[] array1 = {10,20,30,40,45,76,87};
		int[] array2 = {50,60,70,45,6,78,67,98,90};

		m1(array1,array2);
		
		int[] concatinatedArray = concat(array1, array2);
		
		System.out.println(Arrays.toString(concatinatedArray));
	}
	
	
	public static void m1(int[]...a)
	{
		System.out.println(Arrays.toString(a));

		for(int[] x : a)
		{
			System.out.println(Arrays.toString(x));
		}
	}

	public static int[] concat(int[] array1, int[] array2) {
		
		int[] result = new int[array1.length + array2.length] ;
		int count = 0;
		for(int i=0; i<array1.length; i++)
		{
			result[i] = array1[i];
			count++;
		}
		
		for(int i=0; i<array2.length; i++)
		{
			result[count] = array2[i];
			count++;
		}
		
		return result;
	}
	

}
