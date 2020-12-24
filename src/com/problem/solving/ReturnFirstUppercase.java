package com.problem.solving;

public class ReturnFirstUppercase {

	public static void main(String[] args) {
		String str="fvjjgvjgvvgHjgvdjcGDFDGF";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
