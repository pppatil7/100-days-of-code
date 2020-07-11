package learn.corejava.collection;

import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("mango");
		a1.add("banana");
		a1.add("apple");
		a1.add("pineapple");
		
		
		System.out.println("returning element: "+a1.get(1));
		a1.set(1, "cherry");
		
		for(String fruit: a1) {
	    System.out.println(fruit);
			
		}

	/*	Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}   */

	}

}
