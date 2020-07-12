package learn.corejava.collection;
import java.util.*;
import java.util.ArrayList;


public class TestJavaCollection3 {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
        a1.add("msd");
        a1.add("virat");
        a1.add("sachin");
        
        System.out.println("elements of first list: "+a1);
        
        a1.add(1, "yuvraj");
        System.out.println("after adding element in first list: "+a1);
        
        ArrayList<String> a2=new ArrayList<String>();
        a2.add("bumrah");
        a2.add("shami");
        a1.addAll(a2);
        
        System.out.println("first list after adding second list: "+a1);
        a1.remove(2);
        System.out.println("after removing element through first list:  "+a1);
        a1.remove(4);
        System.out.println("after removing element through first list: "+a1);
        
        ArrayList<String> a3=new ArrayList<String>();
        a3.add("sehwag");
        a3.add("ashwin");
        a1.addAll(3, a3);
        System.out.println("first list after adding third list: "+a1);
        
        
        a1.remove("ashwin");
        System.out.println(a1);
        
        a1.removeAll(a2);
        System.out.println(a1);
        
        a1.removeIf(str->str.contains("sachin"));
        System.out.println(a1);
        
        Iterator<String> itr=a1.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        a1.clear();
        System.out.println(a1);
        
	}

}
