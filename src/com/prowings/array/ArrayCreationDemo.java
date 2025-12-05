package com.prowings.array;

public class ArrayCreationDemo {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5]; //this will create an array of size 5 and of type - int
		
		numbers[0] = 10;
		numbers[1] = 20;
//		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		
		System.out.println(numbers.getClass().getName());
		
//		int initialVal = 10;
//
//		for(int i=0; i<5; i++)
//		{
//			numbers[i] = initialVal;
//			initialVal += 10;
//		}
//		
		System.out.println("--------------------------------");
		
		for(int i=0; i<5; i++)
		{
			System.out.println(numbers[i]);
		}
		
	}

}
