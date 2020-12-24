package com.problem.solving;

public class InsertUnsorted1 {
	
	public static int insertElement(int[] arr,int n,int key,int capacity) {
		
		if(n>=capacity) 
			return n;
		arr[n]=key;
		return n+1;
	}
	
	
	
	public static void main(String[] args) {
	int[] arr=new int[20];
		arr[0]=13;
		arr[1]=21;
		arr[2]=13;
		arr[3]=17;
		arr[4]=28;
		arr[5]=35;
		arr[6]=39;
		int capacity=20;
		int n=3;
		int i,key=100;
		System.out.println("array before insertion");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		n=insertElement(arr, n, key, capacity);
		
		System.out.println("array after insertion");
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
