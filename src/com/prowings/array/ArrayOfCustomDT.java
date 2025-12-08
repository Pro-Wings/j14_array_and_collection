package com.prowings.array;

import java.util.Arrays;

public class ArrayOfCustomDT {
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "Ram");
		Student s2 = new Student(20, "Sham");
		Student s3 = new Student(30, "Sachin");
		Student s4 = new Student(40, "Rahul");
		
		Student[] groupOfStudents = {s1,s3,s4};

		System.out.println(Arrays.toString(groupOfStudents));

		Object[] array = groupOfStudents;
	}

}
