package com.learn.practice;

public class ReverseString {

	public static String reverseString(String str) {
		String revstr="";
		for(int i=(str.length()-1);i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		return revstr;
	}
	public static void main(String[] args) {
	
		String str="my name is";
		str=reverseString(str);
		System.out.println(str);

	}

}
