package com.problem.solving;

public class CountVowel {

	public static void main(String[] args) {
		String str="gfvjbdjgh jhfbn fh hfbhbhaeiou gcjbvgawasrcfv  b bc";
		int count=0;
		int counter=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}
			else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				counter++;
			}
		}
       System.out.println(count);
       System.out.println(counter);
	}

}
