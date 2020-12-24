package com.problem.solving;

import java.util.Scanner;

public class AddDigit {

	public static void main(String[] args) {
		int sum=0;
		int remainder;
		int number=0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		
		
		while(number!=0) {
			remainder = number%10;
			sum = sum + remainder;
			number = number/10;
		}
		System.out.println(sum);
		
	}
}
