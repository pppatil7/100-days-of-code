package learn.corejava.collection;
import java.util.*;
public class TestLinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("sanath");
		l1.add("kusal");
		l1.add("kumar");
		l1.add("ajantha");
		l1.add("mahela");
		
		Iterator i =l1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
			

	}

}
