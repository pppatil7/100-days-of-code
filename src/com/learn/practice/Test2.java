package com.learn.practice;

import java.util.Scanner;

public class Test2 {
    	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String name=null;
		String city=null;
		String mobile=null;
		String college=null;
		
		System.out.println("enter name: ");
		name=sc.nextLine();
		System.out.println("enter your city name: ");
		city=sc.nextLine();
		System.out.println("enter mobile number: ");
		mobile=sc.nextLine();
		System.out.println("enter college name: ");
		college=sc.nextLine();
		
		System.out.println("____________________________");
		System.out.println("your name: "+name);
		System.out.println("your city: "+city);
		System.out.println("your mobile number: "+mobile);
		System.out.println("your college name: "+college);
	}
}