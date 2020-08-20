package com.project;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=s1.nextLine();
		System.out.println("Your name is:"+name);
		char c=s1.next().charAt(0);
		System.out.println(c);
	}

}
