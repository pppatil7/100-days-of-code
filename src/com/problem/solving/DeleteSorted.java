package com.problem.solving;

public class DeleteSorted {

	public static int binarySearch(int[] arr, int low, int high, int key) {
		if (high < low)
			return -1;
		int mid = (low + high)/2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);
		return binarySearch(arr, low, (mid - 1), key);
	}

	public static int deleteElement(int[] arr, int n, int key) {
		int pos = binarySearch(arr, 0, n - 1, key);
		if (pos == -1) {
			System.out.println("element not found");
			return n;
		}

		int i;
		for (i = pos; i < n - 1; i++);
		
		arr[i] = arr[i + 1];

		return n - 1;
	}
	
	public static void main(String[] args) {
	    int i;
		int[] arr ={10, 20, 30, 40, 50};
		int n=arr.length;
		int key=30;
				
		System.out.println("array before deletion");
		for(i=0; i<n; i++)
	    System.out.print(arr[i] + " ");
		
		n=deleteElement(arr, n, key);
		
		System.out.println("array after deletion");
		for(i=0; i<n; i++)
		System.out.print(arr[i]+ " ");
		
		
	}
}
