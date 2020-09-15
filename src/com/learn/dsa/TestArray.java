package com.learn.dsa;

public class TestArray {

	public static void main(String[] args) {
		int marks[]= {90,91,88,73,87};
		int i;
		float total=0;
		for(i=0;i<marks.length;i++) {
			total = total + marks[i];
		}
		System.out.println(total);
		System.out.println(marks.length);
		System.out.println(i);
		System.out.println(marks.hashCode());
	}
}
