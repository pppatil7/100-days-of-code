package learn.java.telusko;

import java.util.*;

public class TestCollection {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("patil");
		c1.add(7);
		c1.add("ppp");
		c1.add(16);
		
				
		
		
		Iterator itr = c1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
        for(int i=0;i<c1.size();i++) {
        	System.out.println(c1);
        }
	}

}
