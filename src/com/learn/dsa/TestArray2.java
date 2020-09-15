package com.learn.dsa;

public class TestArray2 {
 static int summation(int arr[]) {
        int sum=0,i;
        for(i=0;i<arr.length;i++) {
        	sum=sum+arr[i];
        	
        }
		return sum;
	}

	public static void main(String[] args) {
	 int arr[]= {2,4,6,1,7};
	 int sum=summation(arr);
     System.out.println(sum);
	}
}

