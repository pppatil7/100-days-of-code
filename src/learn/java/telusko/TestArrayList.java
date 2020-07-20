package learn.java.telusko;
import java.util.*;

public class TestArrayList {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(123);
		l1.add(890);
		l1.add(234);
		l1.add(556);
		
		Collections.sort(l1);
		Collections.reverse(l1);
		Collections.reverse(l1);
		Collections.shuffle(l1);
		Collections.reverse(l1);
		
		for(Integer i:l1) {
			System.out.println(i);
		}

	}

}
