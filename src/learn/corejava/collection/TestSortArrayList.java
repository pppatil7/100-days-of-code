package learn.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestSortArrayList {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("banana");
		a1.add("apple");
		a1.add("pineapple");
		a1.add("mango");
		
		Collections.sort(a1);
		for(String fruit:a1) {
			System.out.println(fruit);
		}
		
		System.out.println("sorting numbers");
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(17);
		a2.add(67);
		a2.add(77);
		a2.add(7);
		
		Collections.sort(a2);
		
		for(Integer number:a2) {
			System.out.println(number);
		}
		
		
	}

}
