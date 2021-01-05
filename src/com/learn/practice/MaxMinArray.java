package com.learn.practice;

public class MaxMinArray {

	public static int[] maxMinElement(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		int[] maxMin=new int[2];
		maxMin[0]=min;
		maxMin[1]=max;
		return maxMin;
	}
	public static void main(String[] args) {
		int[] arr= {1000, 11, 445, 1, 330, 3000};
		int[] minMax=maxMinElement(arr);
		
		System.out.println("minimum element: "+minMax[0]+"  maximum element: "+minMax[1]);
	}
}
