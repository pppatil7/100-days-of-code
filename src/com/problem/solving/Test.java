package com.problem.solving;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		
		Map<Character,Integer> ch=new HashMap<Character, Integer>();
		int counter=1;
		for(char c='A';c<='Z';++c) {
			ch.put(c, counter);
			System.out.println(c+" "+counter);
			counter++;
		}
	}
}
