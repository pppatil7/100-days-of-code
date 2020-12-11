package com.learn.dsa;

public class Array1 extends Array {

	
	public static void main(String[] args) {
		int n=154,a=0,c=0;
		int temp=n;
		
		System.out.println(n);
		while(n>0)  
	    {  
	    a=n%10;  
	    n=n/10;  
	    c=c+(a*a*a);  
	    }  
		System.out.println(n);
	System.out.println(c);
	
	}

	

}
