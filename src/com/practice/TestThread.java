package com.practice;

public class TestThread {

	public static void main(String[] args) {
		Thread thread=new Thread();
		 thread.setName("td");
		System.out.println(thread.getName());
		System.out.println(thread.getState());
		thread.suspend();
		System.out.println(thread.getState());
	   

	}

}
