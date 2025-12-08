package com.prowings.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CastingIssusInArray {

	public static void main(String[] args) {
		
		int[] num1 = {10,20,30,40,50};
		
//		List<Integer> list = Arrays.asList(num1); //this is not allowed

		List<Integer> list = new ArrayList<>();

		for(int n : num1)
			list.add(n);

		System.out.println(list);
	}
	
}
