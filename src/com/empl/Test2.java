package com.empl;

public class Test2 {

	public static void main(String[] args) {
	try {
		//int x=5/0;	
		//int y=9/0;
		int[] arr=new int[4];
		for(int i=0;i<6;i++) {
			arr[i]=0;
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	}

}
