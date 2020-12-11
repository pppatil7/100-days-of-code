package com.learn.dsa;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		int sum = 0;
		int n;
		System.out.println("enter the number you have to check: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum==n) {
			System.out.println("entered number is perfect");
		}
		else {
			System.out.println("entered number is not perfect");
		}

	}
}
