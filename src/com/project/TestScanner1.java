package com.project;

import java.util.Scanner;

public class TestScanner1 {

	public static void main(String[] args) {
		String s="welcome to scanner";
		Scanner s1=new Scanner(s);
		System.out.println(s1.hasNext());
		System.out.println(s1.nextLine());
		s1.close();
		
		System.out.println("----enter your details----");
		Scanner s2=new Scanner(System.in);
		System.out.println("enter your id:");
		int id=s2.nextInt();
		System.out.println("enter your name:");
		String name=s2.next();
		System.out.println("enter your salary:");
		double salary=s2.nextDouble();
		
		System.out.println("----your details are----");
		System.out.println("your id is:"+id);
		System.out.println("your name is:"+name);
		System.out.println("your salary is:"+salary);
		s2.close();
		}
}
