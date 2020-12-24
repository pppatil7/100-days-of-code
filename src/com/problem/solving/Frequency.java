package com.problem.solving;

public class Frequency {

	public static void main(String[] args) {
		int[] arr= {2,5,2,2,8,5,8,7,6,3,1,7};
		int number=5;
		int frequency=0;
		for(int i=0;i<arr.length;i++) {
			if(number==arr[i]) {
				frequency++;
			}
		}
      System.out.println(frequency);
	}

}
