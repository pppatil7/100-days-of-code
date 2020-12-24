package com.problem.solving;

public class CountVowelConsonant {

	public static void main(String[] args) {
		String str="This is a really simple sentence";
		int vCount=0;
		int cCount=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='a' || str.charAt(i)=='o' || str.charAt(i)=='u') {
			     vCount++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
				cCount++;
			}
		}
		System.out.println(vCount);
		System.out.println(cCount);
	}
}
