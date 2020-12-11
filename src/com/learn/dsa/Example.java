package com.learn.dsa;

import java.util.Scanner;

public class Example {
	    
	    
	    
    public static void main(String[] args) {
		int availableTea=1000;
		int availableMilk=200;
		int total=availableTea+availableMilk;
    	
    	for(int i=0; i<=total; i++) {
		Scanner sc=new Scanner(System.in);
    	System.out.println("enter the cup of tea you wanted");
		int wantedTeaNumber = sc.nextInt();
		System.out.println("enter the cup of milk you wanted");
		int wantedMilkNumber = sc.nextInt();
		System.out.println("take your "+wantedTeaNumber+" Tea");
		System.out.println("take your "+wantedMilkNumber+" Milk");
		availableTea=availableTea-wantedTeaNumber;
		availableMilk =availableMilk-wantedMilkNumber;
		System.out.println("Available Tea "+availableTea);
		System.out.println("Available Milk " +availableMilk);
		System.out.println("");
		
		
    	}
	}
	
}