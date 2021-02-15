package com.practice;

public class RevStr {

	public static void main(String[] args) {
	
		String str="mindtree";
		//char[] ch=str.toCharArray();
		//eErTdNiM
		String str1="";
		char c=' ';
		for(int i=(str.length()-1);i>=0;i--) {
			if(i%2==0) {
				c=str.charAt(i);
				str1=str1+Character.toUpperCase(c);
			}
			else {
				c=str.charAt(i);
				str1=str1+Character.toLowerCase(c);
			}
		}
		
		System.out.println(str1);
		
		
	}

}
