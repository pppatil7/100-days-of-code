package com.practice;

public class TestStudent {

	public static void main(String[] args) {
		Student student=new Student(1, "patil", "sae");
		System.out.println(student);
		student.setCollege("sinhgad");
		System.out.println(student);
		System.out.println(student.getCollege());
	}

}
