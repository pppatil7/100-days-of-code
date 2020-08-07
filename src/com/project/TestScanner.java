package com.project;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=s1.nextLine();
		System.out.println("Your name is:"+name);
		s1.close();
	}

}
