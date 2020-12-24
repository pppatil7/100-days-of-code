package com.problem.solving;

public class ArrayLargestElement {

	public static void main(String[] args) {
		int[] arr= {5,1,4,7,9,34,67,2};
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("largest element of an array "+max);
	}

}
