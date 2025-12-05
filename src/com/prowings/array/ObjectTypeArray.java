package com.prowings.array;

public class ObjectTypeArray {
	
	public static void main(String[] args) {
		
		Object[] elements = new Object[5];
		
		Student std1 = new Student(10, "Ram");
		Student std2 = new Student(20, "Sham");
		String str1 = "hello";
		StringBuffer stbr = new StringBuffer("hiii");
		int i = 100;

		elements[0] = i;
		elements[1] = str1;
		elements[2] = std1;
		elements[3] = stbr;
		elements[4] = std2;
		
		
		System.out.println(elements);
		
		for(Object o : elements)
		{
			if(o instanceof Student)
				System.out.println(o);
		}
		
	}

}
