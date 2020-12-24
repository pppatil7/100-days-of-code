package com.problem.solving;

public class ArrayEvenPosition {

	public static void main(String[] args) {
		int[] arr= {6,2,5,3,7,1,9,4};
		
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				continue;
			}
			else {
				System.out.print(arr[i]+" ");
			}
		}
	}
}
