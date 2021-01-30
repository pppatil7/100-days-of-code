package com.practice;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {3,1,5,2,7,6};
        int n=arr.length;
        
        for(int i=0;i<n-1;i++) {
        	int minInd=i;
        	for(int j=i;j<n;j++) {
        		if(arr[j]<arr[minInd]) {
        			minInd=j;
        		}
        	}
        	int temp=arr[i];
        	arr[i]=arr[minInd];
        	arr[minInd]=temp;
        }
		System.out.println(Arrays.toString(arr));
	}

}
