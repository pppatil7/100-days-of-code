package com.project;

public class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
       void deposit(int amount) {
    	   if(amount!=0) {
    		   balance=balance+amount;
    		   previousTransaction=amount;
    	   }
    	   
       }
	
       void withdraw(int amount) {
    	   if(amount!=0) {
    		   balance=balance-amount;
    		   previousTransaction=-amount;
    	   }
       }
	
       
	
	
	
}
