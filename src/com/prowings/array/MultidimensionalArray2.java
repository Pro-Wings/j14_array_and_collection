package com.prowings.array;

import java.util.Arrays;

public class MultidimensionalArray2 {
	
	public static void main(String[] args) {
		
		int x = 10;
		
		//Jagged array
		int[][] numbers = {
				{1,2,3},
				{12,23,65,8,76},
				{23,34,54},
				{34,65,76,87}
		};

		System.out.println("--------------------------------------");
		
		print2DArray(numbers);
		
	}

	private static void print2DArray(int[][] numbers) {
		for(int i=0; i<numbers.length; i++)
		{
			for(int j =0; j<numbers[i].length; j++)
			{
				System.out.print("  "+ numbers[i][j]);
			}
			System.out.println();
		}
	}
	
}
