package com.prowings.array;

public class MultidimensionalArray {
	
	public static void main(String[] args) {
		
		//2D array
		int[][] numbers = new int[3][5];

		int[] a = {1,2,3};
		int[] b = {4,5,6};
		int[] c = {7,8,9};
		
		numbers[0] = a;
		numbers[1] = b;
		numbers[2] = c;

//		System.out.println(numbers);
		
		for(int[] e : numbers)
		{
//			System.out.println(e);
			for(int n : e)
			{
				System.out.print(n);
			}
			System.out.println();
		}
		
	}
	
}
