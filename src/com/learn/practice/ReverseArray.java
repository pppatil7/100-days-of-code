package com.learn.practice;

import java.util.Arrays;

public class ReverseArray {

	public static int[] reverseArray(int[] arr) {
   	   int[] rearr=new int[arr.length];
	   int j=0;
   	   for(int i=(rearr.length-1);i>=0;i--) {
   		   rearr[j]=arr[i];
   		   j++;
   	   }
		return rearr;
    }
	
	
	public static void main(String[] args) {
	
		int[] arr= {1,3,2,4,6,5,9,7,8};
		int[] reverse=reverseArray(arr);
		System.out.println(Arrays.toString(reverse));
		
		
	}
}
