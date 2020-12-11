package com.learn.dsa;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
	     int fact=1;
	     System.out.println("enter the number you wanted to check");
		 Scanner sc =new Scanner(System.in);
	     int number=sc.nextInt();
	     for(int i=1;i<=number;i++) {
	    	 fact=fact*i;
	     }
		System.out.println(fact);
}
}
