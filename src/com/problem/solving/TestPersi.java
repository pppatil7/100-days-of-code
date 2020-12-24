package com.problem.solving;

public class TestPersi {
	
	static String Solution(int num) {
		String str="";
		for(int i=1;i<=num;i++) {
			if(i%2!=0) {
				str=str + '+';
			}
			else if(i%2==0) {
				str=str + '-';
			}		
		}
		return str;
	}
	public static void main(String[] args) {
		String string=Solution(5);
		System.out.println(string);	
	}
}
