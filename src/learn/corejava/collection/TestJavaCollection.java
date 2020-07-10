package learn.corejava.collection;

import java.util.*;

public class TestJavaCollection {

	public static void main(String[] args) {
		Stack<String>l1 = new Stack<String>();
		l1.push("amit");
		 l1.push("akash");
		l1.push("john");
		l1.push("akshay"); 
		l1.pop();
		
		Iterator<String> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
	
	}

}
