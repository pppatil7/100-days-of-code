package com.problem.solving;

public class ArraySearch {

	public static int searchArray(int[] arr, int n,int key) {
	
		for(int i=0;i<n;i++) 
			if(arr[i]==key) 
			return i;
		    
		return -1;	
	}
	public static void main(String[] args) {
		int[] arr= {5,4,2,7,9,10,35,24};
		int n=arr.length;
		int key=2;
		int position=searchArray(arr, n, key);
		
		if(position==-1) {
			System.out.println("elment is not in the array");
		}
		else {
			System.out.println("position of that array "+(position+1));
		}
		
	}
}
