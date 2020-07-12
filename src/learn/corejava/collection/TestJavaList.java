package learn.corejava.collection;

import java.util.*;

public class TestJavaList {

	public static void main(String[] args) {
		String[] arr= {"c","cpp","java","javascript","html"};
		System.out.println(Arrays.toString(arr));
		
		List<String> l1=new ArrayList<String>();
		for(String lang:arr) {
			l1.add(lang);
		}
		System.out.println(l1);
		

	}

}
