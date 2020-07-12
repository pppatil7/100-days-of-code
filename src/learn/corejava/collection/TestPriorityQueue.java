package learn.corejava.collection;
import java.util.*;

public class TestPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<String> p1=new PriorityQueue<String>();
		p1.add("Amit");
		p1.add("Vijay");
		p1.add("Karan");
		p1.add("Jai");
		p1.add("Rahul");
		System.out.println(p1.element());
		System.out.println(p1.peek());
		Iterator itr =p1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		p1.remove();
		p1.poll();
		Iterator itr1 =p1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		

	}

}
