package com.problem.solving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestString {
	
	public static void main(String[] args) {
		String str="addfsrtruhhhfdre";
		char[] ch=str.toCharArray();
		//System.out.println(ch);
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]+" ");
		}
		int counter;
		List<Character> list=new ArrayList<Character>();
		Set<Character> set=new HashSet<Character>();
		for(int i=0;i<str.length();i++) {
			set.add(ch[i]);
		}
		System.out.println();
	
		System.out.println(set);
	}
}
