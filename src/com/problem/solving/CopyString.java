package com.problem.solving;

public class CopyString {

	public static void main(String[] args) {
		String str1="sgdjvh";
		String str2="";
		for(int i=0;i<str1.length();i++) {
			str2=str2+str1.charAt(i);
		}

		System.out.println(str2);
		
	}

}
