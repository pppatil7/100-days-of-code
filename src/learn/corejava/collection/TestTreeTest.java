package learn.corejava.collection;
import java.util.*;
import java.util.TreeSet;
public class TestTreeTest {

	public static void main(String[] args) {
	/*	TreeSet<String> t1=new TreeSet<String>();
		t1.add("msd");
		t1.add("virat");
		t1.add("rohit");
		t1.add("bumrah");
		t1.add("msd");
		
		Iterator<String> itr=t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator itr=t1.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		TreeSet<Integer> t2=new TreeSet<Integer>();
		t2.add(16);
		t2.add(61);
		t2.add(52);
		t2.add(7);
		
		System.out.println("highest element: "+set.pollFirst());
		System.out.println("lowest element: "+set.pollLast());

	}

}
