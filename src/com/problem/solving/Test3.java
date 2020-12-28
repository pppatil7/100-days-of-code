package com.problem.solving;

public class Test3 {
	public static void main(String args[])
	{
		Test2 s = new Test2();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop() + " Popped from stack");
		System.out.println(s.peek());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		s.show();
		s.push(233);
		s.push(432);
		s.show();
		s.pop();
		s.show();
		s.push(2333333);
		s.show();
	}
}
