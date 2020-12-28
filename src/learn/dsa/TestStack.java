package learn.dsa;

import java.util.Arrays;

public class TestStack {

	public static void main(String[] args) {
		StackUsingArray s=new StackUsingArray();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(Arrays.toString(StackUsingArray.arr));
		s.pop();
		System.out.println(Arrays.toString(StackUsingArray.arr));
		s.push(7);
		System.out.println(Arrays.toString(StackUsingArray.arr));
		
		
		
	}

}
