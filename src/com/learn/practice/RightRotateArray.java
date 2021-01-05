package com.learn.practice;

import java.util.Arrays;

public class RightRotateArray {
	public static int[] rightRotate(int[] arr) {
		int last=arr[arr.length-1];
		int first=arr[arr.length];
		int[] newArr=new int[arr.length];
		for(int i=1;i<(arr.length-1);i++) {
			newArr[i+1]=arr[i];
		}
		newArr[0]=first;
		newArr[arr.length]=last;	
		return newArr;
	}
	public static void main(String[] args) {
		int[] arr= {9, 8, 7, 6, 4, 2, 1, 3};
		arr=rightRotate(arr);
		System.out.println(Arrays.toString(arr));
	}
}





