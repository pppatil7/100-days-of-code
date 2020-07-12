package learn.corejava.collection;

import java.util.*;

public class TestJavaCollection4 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		System.out.println(a1.isEmpty());
		a1.add("orange");
		a1.add("banana");
		a1.add("apple");
		System.out.println(a1.isEmpty());
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("apple");
		a2.add("orange");
		
		a1.retainAll(a2);
		System.out.println(a1);
		
		Iterator itr=a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
