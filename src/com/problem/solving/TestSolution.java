package com.problem.solving;

public class TestSolution {

	public static void main(String[] args) {
		String str="12213";
		char[] ch=str.toCharArray();
		String reverse="";
		for(int i=ch.length-1;i>=0;i--) {
			reverse = reverse + ch[i];
		}
		System.out.println(reverse);
		
	}
}
