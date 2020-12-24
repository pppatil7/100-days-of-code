package com.problem.solving;

public class DeleteUnsorted1 {

	public static int findElement(int arr[], int n, int key) {
		for (int i = 0; i < n; i++)
			if (arr[i] == key)
				return i;
		return -1;
	}

	public static int deleteElement(int arr[], int n, int key) {
		int pos = findElement(arr, n, key);
		if (pos == -1) {
			System.out.println("element not found");
			return n;
		}

		for (int i = pos; i < n - 1; i++)
			arr[i] = arr[i + 1];
		return n - 1;

	}
	
	
	public static void main(String[] args) {
	
		int[] arr= {1,3,5,7,2};
		int n=arr.length;
		int key=7;
		
		System.out.println("before the deletion");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		n=deleteElement(arr, n, key);
		
		System.out.println("after the deletion");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
