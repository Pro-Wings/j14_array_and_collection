package com.prowings.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArraysAslistMethod {
	public static void main(String[] args) {
		
		Integer[] nums = {30,10,30,10,70,40};
		
		List list = Arrays.asList(nums);
		
		Set hs = new LinkedHashSet<>(list);
		
		System.out.println(hs);
		
	}

}
