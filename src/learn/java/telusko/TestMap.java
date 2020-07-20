package learn.java.telusko;
import java.util.*;
import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
          Map<String,String> m1 = new HashMap<>();
          m1.put("Name", "ppp");
          m1.put("cricketer", "msd");
          m1.put("actor", "akshay");
          m1.put("singer", "arijit");
          
          System.out.println(m1);
          
          Set<String> s1 = m1.keySet();
          
          for(String k1:s1) {
        	  System.out.println(k1+"  "+m1.get(k1));
          }
        		  
        		  
	}

}
