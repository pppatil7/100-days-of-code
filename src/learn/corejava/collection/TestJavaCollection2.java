package learn.corejava.collection;

import java.util.Deque;
import java.util.ArrayDeque;

public class TestJavaCollection2 {

	public static void main(String[] args) {
	Deque<String> d1 = new ArrayDeque<String>();
    d1.add("akshay");
    d1.add("nawaz");
    d1.add("vijay");
    
    for(String str:d1) {
    	System.out.println(str);
    }
	

	}

}
