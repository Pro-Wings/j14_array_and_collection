package com.prowings.array;

import java.util.Arrays;

public class CustomDataArraySorting {
	
	public static void main(String[] args) {

		Student std1 = new Student(10, "Rajesh");
		Student std2 = new Student(20, "Amar");
		Student std3 = new Student(30, "Sumit");
		
		Student[] students = {std3, std1, std2};
		System.out.println("Before Sorting : "+Arrays.toString(students));
		
		Arrays.sort(students);
		
		System.out.println("After Sorting : "+Arrays.toString(students));
		
	}


}
