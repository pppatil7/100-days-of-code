package com.learn.dsa;

public class Array {

	public static void leftRotatebyOne(int arr[], int n) 
    { 
        int i, temp; 
        temp = arr[0]; 
        for (i = 0; i < n - 1; i++) 
            arr[i] = arr[i + 1];
        
        arr[i] = temp; 
       
    } 
	public static void main(String[] args) {
        int[] arr={1,2,3,5,4,9,8,7};
		leftRotatebyOne(arr,8);
		
		
	}
}
