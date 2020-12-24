package com.problem.solving;

public class CopyArray {
    
	public static void main(String[] args) {
		int[] arr1= {4,3,2,9,5,7,2,5,4,3,1,2,1};
		int[] arr2=new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			System.out.print(arr2[j]+" ");
		}
	}

}
