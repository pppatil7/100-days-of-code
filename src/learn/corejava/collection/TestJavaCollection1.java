package learn.corejava.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollection1 {

	public static void main(String[] args) {
	PriorityQueue<String> q1 = new PriorityQueue<String>();
	q1.add("msd");
	q1.add("rohit");
	q1.add("virat");
	q1.add("yuvraj");
	System.out.println("head: "+q1.element());
	System.out.println("head: "+q1.peek());
	System.out.println("iterating the elements");
	Iterator<String> itr = q1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	q1.remove();
	q1.poll();
	System.out.println("after removing two elements");
	Iterator<String> itr1 = q1.iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next());
	}
	

	

	}

}
