package com.learn.practice;

public class FirstUpper {
	
	
	public static String firstLetterUpperCase(String str) {
		
		String firstLetter=str.substring(0, 1);
		String remainingLetters=str.substring(1,str.length());
		
		firstLetter=firstLetter.toUpperCase();
		remainingLetters=remainingLetters.toLowerCase();
		return firstLetter+remainingLetters;
		
	}
	public static void main(String[] args) {
       String str="fffBHBjbjBjHjkgjGknj gjhbj";
       str=firstLetterUpperCase(str);
       System.out.println(str);
	}
}
