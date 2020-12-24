package com.problem.solving;

public class DuplicateRemove {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,6,6,6,6,7,10};
		
		int length=arr.length;
		int req=(int) 0.25*length;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
			      System.out.println(arr[i]+" ");
					break;
				}
				
			}
		}
		
		
	}

}
