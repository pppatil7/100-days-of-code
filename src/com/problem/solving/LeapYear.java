package com.problem.solving;

import java.util.Scanner;

public class LeapYear {
    
	public static void main(String[] args) {
		System.out.println("enter a year: ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int lDigit = year%100;
		if(lDigit%4==0) {
			System.out.println("entered year is a leap year");
		}
		else {
			System.out.println("entered year is not a leap year");
		}
		
	}
}
