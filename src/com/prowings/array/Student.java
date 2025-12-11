package com.prowings.array;

public class Student  implements Comparable<Student>{
	
	private int roll;
	private String name;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student o) {
		//sort by roll number
//		if(this.roll > o.roll)
//			return 2;
//		else if(this.roll == o.roll)
//			return 0;
//		else
//			return -2;
		
		// sort by name
		return this.name.compareTo(o.name);
		
	}
	
	

}
