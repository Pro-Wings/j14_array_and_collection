package com.prowings.array;

import java.util.Arrays;

/**
 * @CopyRight alksjdlkasjdlksadj
 * 
 */
public class DeleteAnElementInArray {

	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60, 70, 80 };
		int position = 6;

		int[] result = deleteElementAt(position, numbers);

		System.out.println(Arrays.toString(result));
	}

	public static int[] deleteElementAt(int position, int[] numbers) {

		// if position is invalid - not in range then break the code
		if ((position < 0) || (position > numbers.length - 1))
			throw new RuntimeException("Invalid Position!!");

		for (int i = position; i < numbers.length - 1; i++) {
			numbers[i] = numbers[i + 1];
		}

		int[] newnumbers = new int[numbers.length - 1];
		for (int i = 0; i < newnumbers.length; i++)
			newnumbers[i] = numbers[i];

		return newnumbers;

	}

}
