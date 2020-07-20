package learn.java.telusko;
import java.util.*;
public class TestList {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("infosys");
		l1.add("amazon");
		l1.add("google");
		l1.add("facebook");
		
		
		for(String o:l1) {
			System.out.println(o);
		}
		
	}

}
