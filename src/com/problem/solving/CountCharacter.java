package com.problem.solving;

public class CountCharacter {

	public static void main(String[] args) {
		String str="i love india";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);
	}
}
