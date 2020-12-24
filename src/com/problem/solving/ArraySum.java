package com.problem.solving;

public class ArraySum {

	public static void main(String[] args) {
		int[] arr={1,0,1,2,5,0,1};
        int sum=0;
		for(int i=0;i<arr.length;i++) {
		sum = sum+arr[i];
		}
		System.out.println(sum);
	}

}
