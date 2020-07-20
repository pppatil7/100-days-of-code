package learn.java.telusko;
import java.util.*;
public class TestSet {

	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<Integer>();
		s1.add(77);
		s1.add(67);
		s1.add(97);
		s1.add(57);
		
		
		
		for(int i:s1) {
			System.out.println(i);
		}
	}

}
