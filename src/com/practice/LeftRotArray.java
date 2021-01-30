package com.practice;

import java.util.Arrays;

public class LeftRotArray {
   public static int[] leftRot(int[] arr, int n, int k) {
	   int[] rotArr=new int[n];
	   int mod = k % n;
	   
       int j=0;
	   for (int i = 0; i < n; i++)
	   {
		   rotArr[j] = arr[(i+mod) % n];
           j++;
	   }
       return rotArr;
    }	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int k=2;
		int[] rot=leftRot(arr, arr.length,k );
		System.out.println(Arrays.toString(rot));
	}
}