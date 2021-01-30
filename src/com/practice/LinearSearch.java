package com.practice;

public class LinearSearch {

	public static int linearSearch(int[] arr,int key) {
		int n=arr.length;
		int index=-1;
		for(int i=0;i<n;i++) {
        	if(arr[i]==key) {
        		index=i;
        	}
        }
		return index;
	}
	
	public static void main(String[] args) {
		int arr[]= {3,1,5,2,7,6};
        int n=arr.length;
        int key=10;
        int index = linearSearch(arr,key);
        System.out.println(index);
        

	}

}
