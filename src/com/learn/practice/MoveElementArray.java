package com.learn.practice;

import java.util.Arrays;

public class MoveElementArray {
   
	
	public static int[] reArrange(int[] arr) {
		//int[] reArrange=new int[arr.length];
		int temp=0;
		for(int i=0;i<arr.length;i++) {
	     
	    	 if(arr[i]<0) {
		    	 arr[i+1]=arr[i];
	    	 }
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] arr= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        arr=reArrange(arr);
        System.out.println(Arrays.toString(arr));
	}

}
