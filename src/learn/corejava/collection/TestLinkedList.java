package learn.corejava.collection;

import java.util.*;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("saurabh");
		l1.add("john");
		l1.add("michael");
		l1.add("akshay");
		
		l1.add(1, "david");
		
		LinkedList<String> l2=new LinkedList<String>();
		l2.add("kevin");
		l2.add("ricky");
		
		l1.addAll(l2);
		l1.addAll(1, l2);
		l1.addFirst("aaron");
		l1.addLast("mitchell");
		
		l1.remove();
		l1.remove();
		l1.remove(5);
		l1.removeAll(l2);
		l1.removeFirst();
		l1.removeLast();
		l1.clear();
		l2.clear();
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(l1);
		System.out.println(l2);
		
		

	}

}
