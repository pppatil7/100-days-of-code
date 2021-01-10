package com.practice;

import java.util.Arrays;

public class ExtraCharacter {

	static char findOneExtraCharacter(String str1,String str2) {
		
		char[] ch1=new char[str1.length()];
		char[] ch2=new char[str2.length()];
		ch1=str1.toCharArray();
		ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		char ch=ch2[(ch2.length-1)];
		
		for(int i=0;i<ch1.length;i++) {
			if(ch1[i]!=ch2[i]) {
				ch=ch2[i];
			}
		}
		return ch;
	}
	public static void main(String[] args) {

        String str1="aba";
        String str2="aaba";
		
		char ch=findOneExtraCharacter(str1, str2);
		System.out.println(ch);
	}

}
